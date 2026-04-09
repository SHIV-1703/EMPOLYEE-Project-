package com.employee.model;

import jakarta.persistence.*;

/**
 * Employee entity class representing the 'employees' table in the database.
 * @Entity marks this class as a JPA entity.
 * @Table specifies the name of the database table to be used for mapping.
 */
@Entity
@Table(name = "employees")
public class Employee {

    /**
     * @Id marks this field as the primary key.
     * @GeneratedValue configures the way of incrementing the specified column (field).
     * GenerationType.IDENTITY indicates that the persistence provider must assign primary keys for the entity using a database identity column.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "department")
    private String department;

    @Column(name = "designation")
    private String designation;

    // Default constructor is required by JPA
    public Employee() {
    }

    // Constructor with parameters for easy object creation
    public Employee(String firstName, String lastName, String email, String department, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.designation = designation;
    }

    // Getters and Setters are required to access and modify the private fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
