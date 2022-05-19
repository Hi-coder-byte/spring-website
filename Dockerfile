#FROM maven as build
#RUN mkdir /app
#WORKDIR /app
#COPY . /app
#RUN mvn clean package -Dmaven.test.skip=true
#
#FROM openjdk
#COPY --from=build /app/target/spring-website-0.0.1-SNAPSHOT.jar .
##COPY ${JAR_FILE} app.jar
#EXPOSE 8081
#ENTRYPOINT ["java", "-Dserver.port=8081", "-jar", "spring-website-0.0.1-SNAPSHOT.jar"]
#

FROM openjdk
ARG JAR_FILE=target/spring-website-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} spring-website-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-Dserver.port=8081", "-jar", "spring-website-0.0.1-SNAPSHOT.jar"]
