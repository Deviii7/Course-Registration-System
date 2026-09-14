# Course Registration System

A Spring Boot-based backend application for managing course details and user course registrations. 
This project was developed as a hands-on learning project to understand Spring Boot, REST APIs, database integration, and backend development.

## About the Project

The Course Registration System allows users to view available courses and register for courses through REST APIs.
Registration details are stored in a MySQL database.

This project helped me gain practical experience in building backend applications using Java and Spring Boot.

Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* REST API
* Postman
* IntelliJ IDEA
* Maven

Features

* View available course details.
* Register users for courses.
* Store course registration details in MySQL.
* Perform database operations using Spring Data JPA.
* Test REST APIs using Postman.

Project Structure

Course Registration System
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │       └── application.properties
│
├── pom.xml
└── README.md
```

 API Endpoints

| Method | Endpoint    | Description                  |
| ------ | ----------- | ---------------------------- |
| GET    | `/courses`  | View available courses       |
| POST   | `/register` | Register a user for a course |

 Database

**Database:** MySQL

The application stores course registration details in a MySQL table.

Example table:

```text
course_registry
```

How to Run the Project

 Prerequisites

* Java JDK
* IntelliJ IDEA
* MySQL
* Maven

Steps

1. Clone this repository.

```bash
git clone https://github.com/Deviii7/-My-Java-Project.git
```

2. Open the project in IntelliJ IDEA.

3. Configure your MySQL database in `application.properties`.

4. Make sure MySQL is running.

5. Run the Spring Boot application.

6. Test the REST APIs using Postman.

What I Learned

* Basics of Spring Boot application development.
* Creating REST APIs.
* Database integration using MySQL.
* Using Spring Data JPA for database operations.
* Testing APIs with Postman.
* Using Git and GitHub for version control.

Future Improvements

* Add update and delete course functionality.
* Add user authentication and authorization.
* Improve validation and exception handling.
* Add a frontend interface.
* Deploy the application online.

Author
Devi.

B.Tech Information Technology Graduate

Interested in Java, Spring Boot, Backend Development, and Learning New Technologies.

---
Thank you for visiting my project!
