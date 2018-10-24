package com.EmployeeRestmongoDb.com.EmployeeRest.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
	public Employee findByFirstname(String firstname);
	public List<Employee> findByAge(int age);

}
