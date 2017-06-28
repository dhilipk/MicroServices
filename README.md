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

## Common Definitions

### Running Consul
In-order to get the consul dicovery services started download and get it installed in your machine. (https://www.consul.io)
- To Run a consul agent >>consul agent -dev
- Consul default takes 8500 port to start the services
- To view the consul UI use -ui command. And use the below command to start the services. >>consul.exe agent -server -ui -bootstrap-expect=1 -data-dir=consul-data -bind=127.0.0.1
- Consul UI URL (http://localhost:8500/ui)

### Running MongoDB
To make few of the MongoDB specific microservices we need to start the MongoDB in the local instance using the command "C:\Program Files\MongoDB\Server\3.4\bin\mongod.exe" --dbpath <PATH> (C:\Dhilip\Studies\MongoDBData)

### Running Microservices
- We can also use mvn command to start the spring boot services using >>mvn spring-boot:run
- Our main method delegates to Spring Boot’s SpringApplication class by calling run. SpringApplication will bootstrap our application, starting Spring which will in turn start the auto-configured Tomcat web server. We need to pass <Module>Application.class as an argument to the run method to tell SpringApplication which is the primary Spring component. The args array is also passed through to expose any command-line arguments.
- The @RequestMapping annotation provides “routing” information. It is telling Spring that any HTTP request with the path mapped to the method. 
- The @RestController annotation tells Spring to render the resulting string directly back to the caller.
- The @SpringBootApplication will be acted as a proxy for @Configuration, @EnableAutoConfiguration, @ComponentScan which will find the configurations in the application, finds the Entity items in the application, scans all the beans configured in the application respectively.

### Ribbon Components for load balancing
- Rule -> a logic component to determine which server to return from a list (AvailabilityFilteringRule, RoundRobinRule, WeightedResponseTimeRule)
- Ping -> a component running in background to ensure liveness of servers
- ServerList -> this can be static or dynamic. If it is dynamic (as used by DynamicServerListLoadBalancer), a background thread will refresh and filter the list at certain interval using ServerListRefreshInterval. If it is static, list of load balancing ip address will be provided within listOfServers.

### Zuul Main features
- Provides a unified access to multiple different microservices
- Hides internal details of the microservice ecosystem
- Load balances across multiple service instances
- Allowes access to services
- Restricts access to internal only services
- Looks up services from Eureka
- Implements filters for authentication or logging purposes

Zuul / Consul has multiple components, but as a whole, it is a tool for discovering and configuring services in your infrastructure.

### OAuth2
The OAuth 2.0 provider mechanism is responsible for exposing OAuth 2.0 protected resources. The configuration involves establishing the OAuth 2.0 clients that can access its protected resources independently or on behalf of a user.
This example is based on the following resources:
 - http://projects.spring.io/spring-security-oauth/docs/oauth2.html
 - http://blog.trifork.com/2016/12/14/service-discovery-using-consul-and-spring-cloud/
 - https://github.com/exteso/oauth2-step-by-step.git
 - http://www.swisspush.org/security/2016/10/17/oauth2-in-depth-introduction-for-enterprises
 - https://github.com/spring-guides/tut-spring-security-and-angular-js/tree/master/proxy
 
#### OAuth2 Four Roles
- Resource owner: Could be you. An entity capable of granting access to a protected resource. When the resource owner is a person, it is referred to as an end-user.
- Resource server: The server hosting the protected resources, capable of accepting and responding to protected resource requests using access tokens.
- Client: An application making protected resource requests on behalf of the resource owner and with its authorization. It could be a mobile app asking your permission to access your Facebook feeds, a REST client trying to access REST API, a web site [Stackoverflow e.g.] providing an alternative login option using Facebook account.
- Authorization server: The server issuing access tokens to the client after successfully authenticating the resource owner and obtaining authorization.

#### OAuth2 Testing
1. Obtain token with: `curl mytrip-client:password@localhost:9001/mytrip-authentication-service/oauth/token -d grant_type=client_credentials`
2. Check the user endpoint with: $ `curl -H "Authorization: Bearer 640f0d0f-a820-41a8-883a-502510b56c71" -v localhost:9001/mytrip-authentication-service/user`
3. Access the Resource with: `curl -H "Authorization: Bearer fd71538f-19ed-4465-9955-080deba461aa" -v localhost:8084/v1/notify/10`

## Services Implementation

### mytrip-web-gateway
Zuul API gateway integrated into spring cloud:
- Service auto registration via eureka
- Service registration by address
- Service registration by service ID
- Filters (logging, authentication)

### mytrip-registry-service
- A microservice ecosystem may consist of a high number of services that need to know each other’s location. If we have multiple environments (dev, qa, uat, prod) then configuring all these services can be very time consuming and error prone.
 - In a cloud environment the ip address and port of the services are not known in advance. Based on demand new service instances can be added or removed on the fly.
 - Any microservice can be added to the using DiscoverEurekaClient, where the microservice is getting registered to the parent registry 
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
-
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
