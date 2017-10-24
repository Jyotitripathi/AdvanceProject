package com.auribises;

public class Employee {

	int eid;
	String ename;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	// Business Method
	public void registerEmployee(int id, String name){
		System.out.println("--Employee Registration Started--");
		
		// Consider, some DB Operation eg: Hibernate will take 2.5 secs to save Employee
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("--Employee Registration Finished--");
	}
}
