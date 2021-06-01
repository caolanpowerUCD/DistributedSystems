FROM openjdk:11-jre
COPY target/registry-1.0.0.jar /library.jar
CMD java -jar /registry.jar $MONGO_HOST
