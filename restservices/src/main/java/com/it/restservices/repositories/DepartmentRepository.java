package com.it.restservices.repositories;
// Importing package module to this code
// Importing required classes
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.restservices.entities.Department;
 
// Annotation
@Repository
 
// Interface
public interface DepartmentRepository
    extends JpaRepository<Department, Long> {
}