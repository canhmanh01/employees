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
	
	@Column(name="first_Name")
	private String firstName;
	
	
	@Column(name="telephone_Number")
	private long telephoneNumber;
	
	
	public Employee() {
		super();
	}


	public Employee(String firstName, long telephoneNumber) {
		super();
		this.firstName = firstName;
		this.telephoneNumber = telephoneNumber;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public long getTelephoneNumber() {
		return telephoneNumber;
	}


	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}




	
	
}
