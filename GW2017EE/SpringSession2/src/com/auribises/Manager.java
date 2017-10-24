package com.auribises;

import java.util.List;

public class Manager {
	
	String name;
	String email;
	int salary;
	
	List<String> certificates;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", email=" + email + ", salary=" + salary + ", certificates=" + certificates
				+ "]";
	}

}
