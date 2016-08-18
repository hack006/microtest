# Spring gradle multiproject microservice test application
This sample app is used to test service communication via REST and also for testing deployment to various CaaS providers.

This app is created as part of semestral work at the CTU in Prague. Project is distributed with MIT license.

## Run

### Gradle
You have to run all services separately and also have PostgreSQL running with database *microservice_test_* accessible
by user *microservice_test* with the password *microservice_test*. YOu can change this in application.properties file.

### Docker compose
Firstly, you have to compile all project by running `gradle bootRepackage`. After successful build you can spin application 
by running `docker-compose up` that creates docker images and then run 3 instances:

* db
* api
* attendance-service

Now you can access running api in your browser at location: http://localhost:8080/api/person/1. Person with id 1
is inserted by init script. You can locate it inside resource folder under db folder.

## Gradle submodules

### api
Main API that is exposed to public internet.

### attendance-service
Microservice that is used to obtain attendance of person. Currently *api* and attendance-service share the same db. For
production purpose there should be own database to minimize coupling!

### contracts
This module contains shared classes via services like transport objects etc.