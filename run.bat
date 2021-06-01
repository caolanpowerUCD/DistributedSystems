CALL mvn compile
CALL mvn package
CALL docker-compose build
CALL docker-compose up