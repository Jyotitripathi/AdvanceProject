package com.auribises;

public class Client {

	public static void main(String[] args) {
		
//		User u1 = new User("John", "+91 99999 99999", "john@example.com", 'M', 20);
//		
//		User u2 = new User();
//		
//		User u3 = new User();
//		u3.setName("Jennie");
//
//		System.out.println(u1.toString());
//		System.out.println(u2);
//		System.out.println(u3);
		
		User user;
		
		user = new WhatsAppUser(); // R T Polymorphic Statement
		user.createGroup();
		//user.setStatus("Hello");
		
		//user = new FaceBookUser();
		
		//user = new UberUser();
		
	}

}
