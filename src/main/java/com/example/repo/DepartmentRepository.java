package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
