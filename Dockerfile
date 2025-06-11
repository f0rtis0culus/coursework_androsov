FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Копіюємо файли
COPY . .

# Даємо виконувані права на mvnw
RUN chmod +x ./mvnw

# Збираємо проєкт
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]
