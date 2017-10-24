package com.auribises;

// Model or Bean or POJO
abstract public class User {
	
	// Attributes
	String name;
	String phone;
	String email;
	char gender;
	int age;
	
	// Constructors
	public User() {
		name = "NA";
		phone = "NA";
		email = "NA";
		gender = ' ';
		age = 0;
	}

	public User(String name, String phone, String email, char gender, int age) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = age;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", email=" + email + ", gender=" + gender + ", age=" + age
				+ "]";
	}
	
	abstract void insertUser();
	abstract void deleteUser();
	abstract void updateUser();
	abstract void retrieveUser();
	
	abstract void createGroup();
	
	
}
