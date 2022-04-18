FROM openjdk:11
MAINTAINER Amith KONDA kondaamithsai8@gmail.com
COPY ./target/Calc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calc-1.0-SNAPSHOT-jar-with-dependencies.jar"]