FROM openjdk:11
MAINTAINER Amith KONDA kondaamithsai8@gmail.com
COPY ./target/SciCal-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "SciCal-1.0-SNAPSHOT-jar-with-dependencies.jar"]