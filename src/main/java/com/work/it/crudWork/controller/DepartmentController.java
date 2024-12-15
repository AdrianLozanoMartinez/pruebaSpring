package com.work.it.crudWork.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.work.it.crudWork.entity.Department;
import com.work.it.crudWork.service.DepartmentService;

//http://localhost:8080/api/departments
@RestController
@RequestMapping("/api/departments")
@CrossOrigin(origins = "http://localhost:4200")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    //http://localhost:8080/api/departments
    @PostMapping
    public Department save(@RequestBody Department department) {
        return departmentService.save(department);
    }

    //http://localhost:8080/api/departments
    @GetMapping
    public List<Department> findAll() {
        return departmentService.findAll();
    }

  //http://localhost:8080/api/departments/id
    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id) {
        return departmentService.findById(id);
    }

  //http://localhost:8080/api/departments/id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        departmentService.deleteById(id);
    }

  //http://localhost:8080/api/departments
    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department department) {
        Department departmentDb = departmentService.findById(id);
        departmentDb.setName(department.getName());
        return departmentService.update(departmentDb);
    }
}
