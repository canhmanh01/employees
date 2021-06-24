package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employess")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="employee_Name")
	private String employeeName;
	
	
	@Column(name="employee_Phone")
	private long employeePhone;
	
	
	public Employee() {
		super();
	}

	

	public Employee(String employeeName, long employeePhone) {
		super();
		this.employeeName = employeeName;
		this.employeePhone = employeePhone;
	}



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public long getEmployeePhone() {
		return employeePhone;
	}


	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}


	




	
	
}
