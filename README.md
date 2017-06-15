# MicroServices - MyTrip Application
This repository provides all the features which which has been fragmented into each of the microservices.

## Pre-Requisites
1. JDK 1.8
2. Maven 3.3.9
3. MongoDB 3.4
4. npm 4.4.4
5. grunt-cli v1.2.0
5. sts-3.8.4 or Eclipse IDE

## Running

- Make sure you have all the pre-requisites installed.
- clone https://github.com/dhilipk/MicroServices.git
- cd ../MicroServices
- mvn clean install
- cd mytrip-registry-service
- java -jar target/mytrip-registry-service-0.0.1-SNAPSHOT.jar
- cd ../flight-search-service
- java -jar target/flight-search-service-0.0.1-SNAPSHOT.jar
- cd ../flight-fare-service
- java -jar target/flight-fare-service-0.0.1-SNAPSHOT.jar
- cd ../customer-information-service
- java -jar target/customer-information-service-0.0.1-SNAPSHOT.jar
- cd mytrip-web
- npm install
- grunt build
- npm start
- Open a browser and try to access http://localhost:8001/

## Services Requirement

### mytrip-registry-service
### flight-search-service
### flight-fare-service
### customer-information-service
