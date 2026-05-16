# Employee Management System

An Employee Management System built using Spring Boot, designed as a reference application.

## Technologies Used
- **Java 17**
- **Spring Boot 3.2.4**
- **Spring Web** (REST APIs and MVC)
- **Spring Data JPA** (Database Operations)
- **Thymeleaf** (Server-Side Rendered UI)
- **H2 In-Memory Database**
- **Maven**

## Features
- Manages employee records using Spring Data JPA.
- Web interface rendered using Thymeleaf.
- Uses an H2 in-memory database for easy setup and testing without needing external database installations.

## Getting Started

### Prerequisites
- JDK 17
- Maven 3.6+

### Running the Application

1. Clone the repository or navigate to the project root directory.
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
   Or run the main class `com.employee.EmployeeSystemApplication` from your IDE.

4. The application will start on port **8081**.
   - You can access the web application at: `http://localhost:8081/`

### Database Configuration
The application uses an H2 in-memory database. 
- **Database URL**: `jdbc:h2:mem:employeedb`
- **Username**: `Shiv`
- **Password**: `password`
- **H2 Console**: The H2 console is enabled for debugging and managing the database via a web interface. You can access it at: `http://localhost:8081/h2-console`
- **JPA DDL-Auto**: `update` (Tables are automatically created/updated based on Entity classes). SQL queries are logged in the console for debugging purposes.

## Testing
To run the tests:
```bash
mvn test
```
