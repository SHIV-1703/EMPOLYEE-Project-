package com.employee.service;

import com.employee.model.Employee;
import java.util.List;

/**
 * Service interface outlining the business operations for Employees.
 * Creating an interface promotes loose coupling and is a standard practice in Spring applications.
 */
public interface EmployeeService {
    
    // Feature 1: Get list of all employees
    List<Employee> getAllEmployees();
    
    // Feature 2: Save external or new employee
    void saveEmployee(Employee employee);
    
    // Feature 3: Get a single employee's details by their ID
    Employee getEmployeeById(Long id);
    
    // Feature 4: Delete an employee by their ID
    void deleteEmployeeById(Long id);
}
