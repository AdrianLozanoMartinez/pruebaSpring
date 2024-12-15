package com.work.it.crudWork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.it.crudWork.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> { 
}
