package com.auribises;

public class User {
	
	Integer uid;
	String name;
	Integer age;
	
	Address adrs; // HAS-A

	//Address[] adrsArr;
	//ArrayList<Address> adrsList;
	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", age=" + age + ", adrs=" + adrs + "]";
	}
	
}
