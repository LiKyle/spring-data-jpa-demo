# 基礎的 Spring Data JPA 示範

本專案的程式範例將說明
1. 使用Spring Data JPA創立一個使用者資料表
2. 新增一些使用者資料
3. 依照年齡或名字查詢使用者資料
4. 修改使用者資料
5. 查詢所有使用者
6. 刪除所有使用者

## 如果是使用 MySQL 或是 MariaDB

* 先創立一個 MySQL 或是 MariaDB 的資料庫，例如取名為 `test`
* 開啟 `src/main/resources/application.properties` 設定檔案
* 指定使用mysql設定 `spring.profiles.active = mysql`
* 開啟 `src/main/resources/application-mysql.properties` 設定檔案
* 設定連結資料庫的 **url, username, password**
* Spring 啟動後會自動創立資料表

## 如果是使用 H2 Database

* 什麼都不用做
* 相關設定寫在 `src/main/resources/application-h2.properties`

## 啟動 Spring boot

**Linux or macOS**  
`./gradlew clean build`

**Windows**  
`gradlew.bat clean build`  

記得先安裝 **OpenJDK** 11 或是更新版

## 主要的程式碼
* src/main/java/test/User.java
* src/main/java/test/UserDao.java
* src/test/java/test/DemoApplicationTests.java

# A simple Spring Data JPA example

This project will demonstrate:
1. Use Spring Data JPA to create a user table.
2. Insert some user data.
3. Select some users by age or name.
4. Update a user data.
5. Select all user data.
6. Delete all user data.

## Use for MySQL or MariaDB

* First create a MySQL or MariaDB database. e.g. Named `test`
* Open `src/main/resources/application.properties`
* Set `spring.profiles.active = mysql`
* Open `src/main/resources/application-mysql.properties`
* Edit the database **url, username, password**
* Spring will automatically create table

## Use for H2 Database

* Nothing to do
* All settings are in `src/main/resources/application-h2.properties`

## Launch Spring boot

**Linux or macOS**  
`./gradlew clean build`

**Windows**  
`gradlew.bat clean build`  

Requires **OpenJDK** 11 or later

## Main source code
* src/main/java/test/User.java
* src/main/java/test/UserDao.java
* src/test/java/test/DemoApplicationTests.java
