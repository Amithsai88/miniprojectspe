pipeline {
  tools{
    jdk '8'
    maven '3.8.5'
  }
  environment {
    registry = "amith1108/miniprojectspe"
    registryCredential = 'Amith'
    dkrImg = ''
    DOCKER_BUILDKIT=0
    COMPOSE_DOCKER_CLI_BUILD=0
    PATH="/usr/local/bin/:$PATH"
  }
  agent any
  stages {
    stage('GIT CLONE') {
      steps {
        git 'https://github.com/Amithsai88/miniprojectspe'
      }
    }
    stage('MVN COMPILE') {
      steps {
        echo "Compiling the source Java classes of the project"
		sh "mvn compile"
      }
    }
    stage('MVN TEST') {
      steps {
        echo "Running the test cases of the project"
        sh "mvn test"
      }
    }
    stage('MVN INSTALL') {
      steps {
        echo "building the project and installs the project files(JAR) to the local repository"
        sh "mvn clean install"
      }
    }
    stage('Building Docker image') {
      steps{
        script {
          echo "Building Docker image"
          dkrImg = docker.build registry + ":latest"
        }
      }
    }
    stage('Deploy Docker Image') {
      steps{

        script {
        //     docker{
        //       registryUrl 'https://index.docker.io/v1/'
        //   }
          echo "Deploying Docker Image to " + registry
        //   docker.withRegistry( '', registryCredential ) {
            dkrImg.push()
        //   }
        }
      }
    }

    stage('Ansible') {
      steps{
        ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible',  inventory: "Inventory",playbook: 'dockerdet.yml', sudoUser: null
      }
    }
  }
}
