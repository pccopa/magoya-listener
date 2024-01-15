
# Magoya Challenge Service Listener

This service, provides a listener for RabbitMQ over accounts service.


## Tech Stack

**API:**
Java 17 with Springboot 3.2.1

**Dependencies manager**: Maven

**Libraries:**
- Spring DataJPA,
- Lombok
- Spring AMQP
- Jackson

**Databases:**
- PostgresSQL


## Installation


## Run Locally
### Requirements
Before starting you need installed in your system
- JDK 17
- Maven
- Git
- Running a PostgresSQL instance with default config. Docker recommended.

### Starting locally
Clone project

```bash
  git clone https://github.com/pccopa/magoya/listener
```
Go to the project directory

```bash
  cd listener
```

Installing dependencies
```bash
  mvn install
```

Starting project

```bash
  mvn spring-boot:run
```
Api operation it will be available on: ```http://localhost:8081/v1/```

### Properties

Special warning when you use this app on localhost, you need to update application.properties and set up correctly your hosts, users and passwords.
- rabbitmq
- postgresSQL


## API Documentation

**Postman:**
You can find the [postman collection](Magoya Challenge.postman_collection.json) in this repo

How to use it: [Help me file](HELP.md)