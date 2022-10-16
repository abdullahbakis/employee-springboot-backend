package com.example.employeespringbootbackend.repository;

import com.example.employeespringbootbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    
}
