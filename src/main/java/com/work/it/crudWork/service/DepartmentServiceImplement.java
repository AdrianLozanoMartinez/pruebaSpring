package com.work.it.crudWork.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.work.it.crudWork.entity.Department;
import com.work.it.crudWork.exception.NotFoundException;
import com.work.it.crudWork.repository.DepartmentRepository;

@Service
public class DepartmentServiceImplement implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImplement(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(Long id) {
        return departmentRepository.findById(id).orElseThrow(
                () -> new NotFoundException("El departamento con id " + id + " no se encuentra")
        );
    }

    @Override
    public void deleteById(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department update(Department department) {
        return departmentRepository.save(department);
    }
}
