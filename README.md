# Holidayzer_API

A REST API built in Java for provide 2024 brazilian holidays.

## Description

This is MY FIRST Web Service build in Java with Spring Boot and Maven, even though I have about of 2 years of experience with the Java Language; so I'm really happy to be able to delve into the ecosystem of one of my favorite languages in a professional way this time!

## Usage

### How it works?

Owns the entity: `holiday`.

### Routers:

- GET `/health`: To get API state

- GET `/holiday`: To get all the 2024 holidays

- GET `/holiday/:date`: To get if date (in the `dd-MM-yyyy` format) is a holiday. For example:

```yml
  /holiday/01-01-2024
```

If the structure is not respected, a error is returned.

# Technologies used

For this project, I used:

- Java (version 17.0.9);
- Spring Boot (version 3.2.1);
- Maven;
- Lombok;
- SonarLint;
