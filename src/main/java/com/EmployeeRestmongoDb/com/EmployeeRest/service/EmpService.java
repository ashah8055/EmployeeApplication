package com.EmployeeRestmongoDb.com.EmployeeRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.Employee;
import com.EmployeeRestmongoDb.com.EmployeeRest.repository.EmployeeRepository;

@Service
public class EmpService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	//Create Operation
	public Employee create(String firstname,String lastname,int age)
	{
		return employeeRepository.save(new Employee(firstname,lastname,age));
	}
	
	//Retrive Operation
	public List<Employee> getAll()
	{
		return employeeRepository.findAll();
	}
	
	//Retrive one Record
	
	public Employee getByFirstName(String firstname)
	{
		return employeeRepository.findByFirstname(firstname);
	}
	
	//Update record
	
	public Employee update(String firstname,String lastname,int age)
	{
		Employee emp = employeeRepository.findByFirstname(firstname);
		emp.setFirstname(firstname);
		emp.setLastname(lastname);
		emp.setAge(age);
		return employeeRepository.save(emp);
	}
	
	// Delete all
	
	public void deleteAll()
	{
		employeeRepository.deleteAll();
	}
	
	public void delete(String firstname)
	{
		Employee emp = employeeRepository.findByFirstname(firstname);
		employeeRepository.delete(emp);
	}
	
}
