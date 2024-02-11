FROM maven:3.8.4-openjdk-17
WORKDIR /app
COPY . .
RUN mvn package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/bloggy-0.0.1-SNAPSHOT.jar"]