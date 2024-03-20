FROM openjdk:11
COPY target/microservice-bank-gateway-0.0.1-SNAPSHOT.jar aplicacion.jar
CMD ["java", "-jar", "aplicacion.jar"]