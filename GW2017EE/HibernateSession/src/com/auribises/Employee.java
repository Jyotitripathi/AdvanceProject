package com.auribises;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// POJO or Model or Bean or Simply Structure of an Object

@Entity
@Table(name="MyEmployee")
public class Employee {

	// Attributes
	
	@Id @GeneratedValue
	@Column(name = "ID")
	int id;
	
	@Column(name = "NAME")
	String name;
	
	@Column(name = "PHONE")
	String phone;
	
	@Column(name = "ADDRESS")
	String address;
	
	@Column(name = "SALARY")
	int salary;
	
	// Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", salary="
				+ salary + "]";
	}
	
	
	
}
