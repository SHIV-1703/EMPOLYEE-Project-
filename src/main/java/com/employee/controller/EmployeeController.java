package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class to handle all HTTP requests for Employee operations.
 * @Controller annotation implies it serves web pages and binds HTTP routes to methods.
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Display list of employees on the home page.
     * @param model is used to pass attributes back to the view.
     * @return the name of the Thymeleaf template to render (index.html).
     */
    @GetMapping("/")
    public String viewHomePage(Model model) {
        // We supply the list of all employees to the "listEmployees" attribute.
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "index";
    }

    /**
     * Show the form for creating a new employee.
     * @param model carries a fresh empty Employee object to the form.
     * @return new_employee.html template.
     */
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        // Create model attribute to bind form data
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    /**
     * Handle the POST request submitted by the new/update employee forms.
     * @param employee The populated employee object sent from Thymeleaf form via @ModelAttribute
     * @return a redirect instruction mapping back to the homepage.
     */
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        // Save employee to database
        employeeService.saveEmployee(employee);
        // Redirect to the home page route ("/") after a successful save
        return "redirect:/";
    }

    /**
     * Show the update form populated with the selected employee's data.
     * @param id The ID passed from the URL path variable.
     * @param model Carries the fetched employee data to the form.
     * @return update_employee.html template.
     */
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        // Get employee from the service layer via ID
        Employee employee = employeeService.getEmployeeById(id);
        
        // Set employee as a model attribute to pre-populate the form
        model.addAttribute("employee", employee);
        return "update_employee";
    }

    /**
     * Delete an employee mapping method.
     * @param id The ID passed from the URL path variable.
     * @return a redirect back to the home page ("/") after deletion.
     */
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {
        // Call the delete method on the service layer
        this.employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
}
