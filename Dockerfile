FROM openjdk:8
MAINTAINER Amith KONDA kondaamithsai8@gmail.com
COPY ./target/Calc-Version1-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calc-Version1-jar-with-dependencies.jar"]