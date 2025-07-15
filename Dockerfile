# Usamos una imagen base de Java
FROM openjdk:17-jdk-alpine

# Creamos un directorio dentro del contenedor
WORKDIR /app

# Copia el jar de la aplicación 
COPY target/ConcesionarioApp.jar ConcesionarioApp.jar

# Puerto en el que se ejecutará la app
EXPOSE 8080

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "ConcesionarioApp.jar"]
