package com.auribises;

public class Child extends Father{
	
	String hobby;
	int vehicles;
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getVehicles() {
		return vehicles;
	}
	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}
	
	@Override
	public String toString() {
		return "Child [hobby=" + hobby + ", vehicles=" + vehicles + "]\n"+super.toString();
	}
}
