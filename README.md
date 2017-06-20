# MicroServices - MyTrip Application
This repository provides all the features which which has been fragmented into each of the microservices.

## Pre-Requisites
1. JDK 1.8
2. Maven 3.3.9
3. MongoDB 3.4
4. npm 4.4.4
5. grunt-cli v1.2.0
5. sts-3.8.4 or Eclipse IDE

## Getting Started

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
### mytrip-web
A Node.js web application framework.

#### Directory structure

- **/config** - Application and middleware configuration
- **/controllers** - Controllers
- **/lib** - Custom developer libraries and other code
- **/locales** - Local-based content
- **/models** - Models
- **/public** - Web resources that are publicly available
- **/public/templates** - Server and browser-side templates
- **/tests** - Unit and functional test cases
     ____                     __      __
    /\  _`\                  /\ \    /\ \                                   __
    \ \ \ \ \     __      ___\ \ \/'\\ \ \____    ___     ___      __      /\_\    ____
     \ \  _ <'  /'__`\   /'___\ \ , < \ \ '__`\  / __`\ /' _ `\  /'__`\    \/\ \  /',__\
      \ \ \ \ \/\ \ \.\_/\ \__/\ \ \\`\\ \ \ \ \/\ \ \ \/\ \/\ \/\  __/  __ \ \ \/\__, `\
       \ \____/\ \__/.\_\ \____\\ \_\ \_\ \_,__/\ \____/\ \_\ \_\ \____\/\_\_\ \ \/\____/
        \/___/  \/__/\/_/\/____/ \/_/\/_/\/___/  \/___/  \/_/\/_/\/____/\/_/\ \_\ \/___/
                                                                           \ \____/
                                                                            \/___/
    (_'_______________________________________________________________________________'_)
    (_.———————————————————————————————————————————————————————————————————————————————._)


Backbone supplies structure to JavaScript-heavy applications by providing models with key-value binding and custom events, collections with a rich API of enumerable functions, views with declarative event handling, and connects it all to your existing application over a RESTful JSON interface.
