package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the Employee Management System.
 * @SpringBootApplication is a convenience annotation that adds all of the following:
 * - @Configuration: Tags the class as a source of bean definitions.
 * - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings.
 * - @ComponentScan: Tells Spring to look for other components, configurations, and services in the 'com.employee' package.
 */
@SpringBootApplication
public class EmployeeManagementApplication {

    public static void main(String[] args) {
        // This line bootstraps the application by starting the embedded web server and initializing the Spring context.
        SpringApplication.run(EmployeeManagementApplication.class, args);
    }
}
