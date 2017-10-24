package com.auribises;

// POJO OR MODEL OR BEAN
public class Student {
	
	// Attributes
	int roll;
	String name;
	int age;
	
	public Student() {
		roll = 0;
		name = "NA";
		age = 0;
		
		System.out.println("Student Object Constructed 1");
	}

	public Student(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		
		System.out.println("Student Object Constructed 2");
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]\n"+super.toString();
	}
	
	public void myInit(){
		System.out.println("--myInit executed--");
	}
	
	public void myDestroy(){
		System.out.println("--myDestroy executed--");
	}
	
}
