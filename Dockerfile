FROM openjdk:17
EXPOSE 8080
ADD target/github-actions-image.jar github-actions-image.jar
ENTRYPOINT ["java","-jar","/github-actions-image.jar"]