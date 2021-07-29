# Taxi Service
_The goal of this project was to implement driver authentication, the ability to create, show cars and manufacturers_
* Register driver
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

 The project has 3 layers :
 * Controller
 * Service
 * DAO

## How to setup a project

1. Clone project and open it in the IDE
2. Download Tomcat 9.0.50
3. Download MySQL and MySQL Workbench
4. Run init_db.sql in the workbench console
5. In the src/main/java/taxi/util/ConnectionUtil.java change the USERNAME and PASSWORD.
6. Configure Tomcat and deploy on taxi-service:war exploded. Also, do not forget to delete Application context
7. After launching, you will have a tab in your browser where you can test the app
