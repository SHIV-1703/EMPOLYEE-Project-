package com.employee.repository;

import com.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Employee entity.
 * By extending JpaRepository, we get a bunch of generic CRUD methods out-of-the-box
 * (save, findById, findAll, deleteById, count, etc.) without writing any default implementation.
 * @Repository annotation is optional here because JpaRepository interface already has a default implementation that is annotated with it,
 * but adding it is a good practice for clarity.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
