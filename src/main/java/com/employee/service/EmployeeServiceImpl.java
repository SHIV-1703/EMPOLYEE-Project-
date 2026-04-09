package com.employee.service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation containing the actual business logic.
 * @Service annotation indicates that it's a Spring-managed service bean.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    // @Autowired injects the EmployeeRepository dependency.
    // Using constructor injection is recommended, but field injection is also common for simplicity.
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        // Fetches all records from the database using the injected repository
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        // Saves the new or updated employee entity to the database
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        // Optional is used to handle situations where an employee might not exist securely
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            // In a real production application, you should throw a custom Exception (e.g., EmployeeNotFoundException)
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        // Removes the employee record by the specified ID
        this.employeeRepository.deleteById(id);
    }
}
