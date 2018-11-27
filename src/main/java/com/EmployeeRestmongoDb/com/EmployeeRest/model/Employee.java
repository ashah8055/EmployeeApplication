package com.EmployeeRestmongoDb.com.EmployeeRest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	String firstname;
	String lastname;
	int age;
	
	
	public Employee(String firstname,
			String lastname, int age) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		}

	

	
	public String toString() {
		return "Employee First Name:"+firstname+" Last Name:"+lastname+" age:"+age;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
		
	
	
}
