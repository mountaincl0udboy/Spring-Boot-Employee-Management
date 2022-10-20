package com.example.springbootcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootcrud.Models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}