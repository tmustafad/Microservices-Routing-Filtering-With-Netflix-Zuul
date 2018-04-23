# Microservices-Routing-Filtering-With-Netflix-Zuul
This bundle consists of two simple projects, One is Login microservice which is running on port 1907 and a gateway project which acts as a reverse proxy and accept requests on port 8080 and filters the requests and direct them to proper microservices .

In the login module a simple controller is created with one request mapping ("/login") returning a simple string.This module's server port is set to 1907 ,once it is started via spring app runner it will be welcoming requests via this port.

In gateway module zuul proxy is used with @EnableZuulProxy annotation. The urls of underlying microservices are defined to direct requests in the application.properties file. Because there is  only one microservices named login ,it is defined there. In this module for filtering requests a simple filter is created as a pre filter.You can see this filter under com.turkmen.gateway.filters.pre package.

Both of the modules are created through start.spring.io. They are both using spring-boot-starter-web.

Once the projects are imported and started you can access the login microservice via http://localhost:8080/loginapp/login  url. This will redirect you to http://localhost:1907/login  . 




