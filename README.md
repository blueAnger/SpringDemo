# SpringDemo
a demo of spring frameworks such as spring-boot, spring-cloud

- SpringConfigServer

    configuration server
    
- SpringService

    service module
    
    get configuration from SpringConfigServer
    
    contains services that will be called by SpringWeb module

- SpringEurekaServer

    eureka server module，other modules register themselves here

- SpringWeb

    a simple restful backend，invoke services of SpringService through eureka
    
- SpringZookeeperService

    Like SpringService, except it connects to zookeeper server instead of eureka server
    
## Boot Sequence
### Spring Cloud Eureka

1. SpringConfigServer
2. SpringEurekaServer
3. SpringService
4. SpringWeb

Test——curl localhost:8080/test/jdbc

### Spring Cloud Zookeeper
1. SpringZookeeperService
2. SpringWeb

Test——curl localhost:8080/test/user