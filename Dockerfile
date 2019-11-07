FROM openjdk:8-jdk
ADD target/pricing.jar pricing.jar
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "pricing.jar" ]