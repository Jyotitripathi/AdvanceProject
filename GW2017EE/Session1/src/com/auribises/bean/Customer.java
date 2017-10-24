package com.auribises.bean;

// Bean or Model or POJO
public class Customer {
	
	// Attributes
	String email;
	String name;
	char gender;
	int type;
	String phone;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	

	public Customer(String email, String name, char gender, int type) {
		this.email = email;
		this.name = name;
		this.gender = gender;
		this.type = type;
	}



	public Customer(String email, String name, char gender, int type, String phone) {
		super();
		this.email = email;
		this.name = name;
		this.gender = gender;
		this.type = type;
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
