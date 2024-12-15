package com.work.it.crudWork.service;

import java.util.List;
import com.work.it.crudWork.entity.Employee;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> findAll();
    Employee findById(Long id);
    void deleteById(Long id);
    Employee update(Employee employee);
}
