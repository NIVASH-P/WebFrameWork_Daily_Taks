package com.productpagination.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productpagination.employee.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    
}
