## Requirements

For building and running the application you need:

Java 17

Spring Boot 3.0.0

PostgreSql

Eclipse/STS

## Running the application locally:

Changes your Username and Password for postgres from application.properties file.

Exacute main method in the com.java.iapps.IappsApplication class from your IDE.

## API endpoints:

Post API(for extracting the content from xml and storing into database):

**localhost:8080/api/parse/xml**
Key                value 
xmlFile	           sample.xml(select xml file)	

Get API(for geting response data stored into database): 

**localhost:8080/api/epapers**

Get API (with Pagination and filtering with NewsPapereName):

**localhost:8080/api/epapers?query=ab&page=1&size=4&sort=id,DESC**

## Running Unit test cases
mvn test
