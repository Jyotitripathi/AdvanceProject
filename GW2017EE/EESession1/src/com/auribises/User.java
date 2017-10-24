package com.auribises;

//Bean
public class User {

	// Attributes
	int id;
	String email;
	String password;
	int age;
	int salary;
	
	public User(){
		
	}
	
	public User(int id, String email, String password, int age, int salary) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.age = age;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", age=" + age + ", salary=" + salary
				+ "]";
	}
	
}
