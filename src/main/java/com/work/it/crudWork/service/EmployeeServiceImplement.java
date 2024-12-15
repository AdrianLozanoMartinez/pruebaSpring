package com.work.it.crudWork.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.work.it.crudWork.entity.Employee;
import com.work.it.crudWork.exception.NotFoundException;
import com.work.it.crudWork.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplement implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImplement(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElseThrow(
            () -> new NotFoundException("El empleado con id " + id + " no se encuentra")
        );
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }
}
