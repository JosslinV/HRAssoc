package com.azilab.hrassoc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.azilab.hrassoc.model.Employee;

@Repository // Specialization of @Component -> Class is a bean communicationg with data source 
// CrudRepository -> Genericity used, the specified class need to have @Entity
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}