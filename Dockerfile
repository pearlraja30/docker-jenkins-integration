FROM openjdk:11
EXPOSE 7000
ADD target/docker-jenkins-integration.jar docker-jenkins-integration.jar
ENTRYPOINT ["java", "-jar","/docker-jenkins-integration.jar"]