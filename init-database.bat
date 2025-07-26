@echo off
echo Initializing CareCompare database...

rem Run Spring Boot with the initialization properties
call mvn spring-boot:run -Dspring-boot.run.arguments="--spring.config.location=classpath:db-init.properties"

echo Database initialization completed.
echo You can now run the application normally with: mvn spring-boot:run 