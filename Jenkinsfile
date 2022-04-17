pipeline {
  tools{
    jdk '8'
    maven '3.8.5'
  }
  environment {
    registry = "amith1108/miniprojectspe"
    registryCredential = 'Amith'
    dkrImg = ''
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
          echo "Deploying Docker Image to " + registry
          docker.withRegistry( '', registryCredential ) {
            dkrImg.push()
          }
        }
      }
    }

    stage('Ansible') {
      steps{
        ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible',  invetory: "Inventory",playbook: 'dockerdet.yml', sudoUser: null
      }
    }
  }
}
