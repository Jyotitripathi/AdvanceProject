package com.auribises;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyClient {

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
			
			Certificate c1 = new Certificate();
			c1.setCname("OCJP");
			
			Certificate c2 = new Certificate();
			c2.setCname("AWS");
			
			//Certificate c3 = new Certificate();
			//c3.setCname("CCNA");
			
			List<Certificate> list = new ArrayList<>();
			list.add(c1);//0
			list.add(c2);//1
			//list.add(c3);//2
			
			Manager mgr = new Manager();
			mgr.setName("Jennie");
			mgr.setSalary(75000);
			mgr.setCertiList(list);

			session.save(mgr);
			
			transaction.commit();
			System.out.println("--Transaction Done--");
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
