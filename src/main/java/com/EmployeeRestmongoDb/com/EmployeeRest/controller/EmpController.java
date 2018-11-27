package com.EmployeeRestmongoDb.com.EmployeeRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.Employee;
import com.EmployeeRestmongoDb.com.EmployeeRest.service.EmpService;

@RestController
public class EmpController {
	
	
	@Autowired
	private EmpService employeeservice;
	
	
	@RequestMapping("/employee")
	public Employee create(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age)
	{
		Employee emp = employeeservice.create(firstname, lastname, age);
		return emp;
	}
	@PostMapping("/employee")
	public String createPost(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age)
	{
		Employee emp = employeeservice.create(firstname, lastname, age);
		return emp.toString();
	}
	@RequestMapping("/get")
	public Employee getPerson(@RequestParam String firstname) {
		return employeeservice.getByFirstName(firstname);
	}
	@RequestMapping("/getAll")
	public List<Employee> getAll(){
		return employeeservice.getAll();
	}
	@RequestMapping("/update")
	public String update(@RequestParam String firstname, @RequestParam String lastname, @RequestParam int age) {
		Employee emp = employeeservice.update(firstname, lastname, age);
		return emp.toString();
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam String firstname) {
		employeeservice.delete(firstname);
		return "Deleted "+firstname;
	}
	@RequestMapping ("/deleteAll")
	public String deleteAll() {
		employeeservice.deleteAll();
		return "Deleted all records";
	}

}
