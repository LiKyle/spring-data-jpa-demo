# A simple Spring Data JPA example

This project will demonstrate:
1. Use Spring Data JPA to create a user table.
2. Insert some user data.
3. Select some users by age or name.
4. Update a user data.
5. Select all user data.
6. Delete all user data.

## Use for MySQL or MariaDB

* First create a MySQL or MariaDB database
* Open `src/main/resources/application.properties`
* Set `spring.profiles.active = mysql`
* Open `src/main/resources/application-mysql.properties`
* Set the database **url, username, password**
* Spring will automatically create table

## Use for H2 Database

* Nothing to do
* All settings are in `src/main/resources/application-h2.properties`

## Launch

**Linux or macOS**  
`./gradlew clean build`

**Windows**  
`gradlew.bat clean build`  

Requires **OpenJDK** 11 or later

## Main source code
* src/main/java/test/User.java
* src/main/java/test/UserDao.java
* src/test/java/test/DemoApplicationTests.java
