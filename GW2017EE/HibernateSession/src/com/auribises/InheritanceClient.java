package com.auribises;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceClient {

	public static void main(String[] args) {
		
		// Hibernate API's
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		
		try {
			
			config = new Configuration();
			config.configure(); // Read hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			CA ca = new CA();
			ca.setA(10);
			
			CB cb = new CB();
			cb.setA(100);
			cb.setB(200);
			
			CC cc = new CC();
			cc.setA(1000);
			cc.setB(2000);
			cc.setC(3000);
			
			session.save(ca);
			session.save(cb);
			session.save(cc);
			
			transaction.commit();
			System.out.println("--Transaction Done--");
		} catch (Exception e) {
			e.printStackTrace();
			//transaction.rollback();
		}

	}

}
