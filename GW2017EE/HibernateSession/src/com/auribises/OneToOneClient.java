package com.auribises;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneClient {

	public static void main(String[] args) {
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // By default read hibernate.cfg.xml
			//config.configure("myfilename.xml"); // reads myfilename.cfg.xml
			
			factory = config.buildSessionFactory();
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			User user = new User();
			user.setName("Jennie");
			user.setAge(21);
			
			Address address = new Address();
			address.setAdrsLine("BRS Nagar");
			address.setCity("Ludhiana");
			address.setState("Punjab");
			address.setZipCode(141001);
			
			user.setAdrs(address);
			address.setUser(user);
			
			session.save(user); // Save only user, address shall be saved automatically
			
			transaction.commit();
			
			
		} catch (Exception e) {
			System.out.println("Some Exception : "+e);
		}
		

	}

}
