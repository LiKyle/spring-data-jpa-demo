## Database config

* Open `src/main/resources/application.properties`
* Set url, username, password
* You can use MySQL or MariaDB
* Spring will automatically create table

## Launch

Linux or macOS  
`./gradlew clean build`

Windows  
`gradlew.bat clean build`  

Requires **OpenJDK** 11 or later

## Main source code
* src/main/java/test/User.java
* src/main/java/test/UserDao.java
* src/test/java/test/DemoApplicationTests.java
