# Taxi Service
The goal of this project was to create a taxi service prototype. In this project you can :
* Driver authentication 
* Create new car, manufacturer
* Display all cars, drivers and manufacturers
* Ability to delete cars, drivers, manufacturers

## Technologies
* Servlet
* JDBC
* MySQL
* Tomcat
* JSTL
* JSP
* Maven
* Logger

 The project has 3 layers :
 * Controller
 * Service
 * DAO

## How to setup a project

1. Clone project and open it in the IDE
2. Download Tomcat 9.0.50
3. Download MySQL and MySQL Workbench
4. Run `src/main/resources/init_db.sql` in the workbench console
5. In the `src/main/java/taxi/util/ConnectionUtil.java` change the USERNAME and PASSWORD.
6. For Logger you should write a path where logs will be saved in `src/main/resources/log4j2.xml` to "filename"
7. Configure Tomcat and deploy on taxi-service:war exploded. Also, do not forget to delete Application context
8. After launching, you will have a tab in your browser where you can test the app
