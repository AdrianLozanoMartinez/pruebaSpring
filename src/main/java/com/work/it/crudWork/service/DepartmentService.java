package com.work.it.crudWork.service;

import java.util.List;
import com.work.it.crudWork.entity.Department;

public interface DepartmentService {
    Department save(Department department);
    List<Department> findAll();
    Department findById(Long id);
    void deleteById(Long id);
    Department update(Department department);
}
