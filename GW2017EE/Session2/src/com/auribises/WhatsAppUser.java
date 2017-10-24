package com.auribises;

public class WhatsAppUser extends User{
	
	String status;
	
	public WhatsAppUser() {
		status = "Not Available";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	void createGroup(){
		System.out.println("Lets create a Group");
	}

	@Override
	public String toString() {
		return "WhatsAppUser [status=" + status + "]";
	}

	@Override
	void insertUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void updateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void retrieveUser() {
		// TODO Auto-generated method stub
		
	}
	
}
