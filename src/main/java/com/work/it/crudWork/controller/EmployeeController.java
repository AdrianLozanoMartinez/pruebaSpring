package com.work.it.crudWork.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.work.it.crudWork.entity.Employee;
import com.work.it.crudWork.service.EmployeeService;

//http://localhost:8080/api/employees
@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

  //http://localhost:8080/api/employees
    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

  //http://localhost:8080/api/employees
    @GetMapping
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

  //http://localhost:8080/api/employees/id
    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id) {
        return employeeService.findById(id);
    }

  //http://localhost:8080/api/employees/id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        employeeService.deleteById(id);
    }

  //http://localhost:8080/api/employees
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeService.findById(id);
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setDni(employee.getDni());
        existingEmployee.setAddress(employee.getAddress());
        existingEmployee.setDepartments(employee.getDepartments());
        existingEmployee.setRole(employee.getRole());
        return employeeService.update(existingEmployee);
    }
}

