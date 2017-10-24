package com.auribises;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Client {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		//emp1.setId(101);
		emp1.setName("Jennie");
		emp1.setPhone("+91 99999 99999");
		emp1.setAddress("Southern Shores");
		emp1.setSalary(70000);

		Employee emp2 = new Employee();
		//emp1.setId(101);
		emp2.setName("Jack");
		emp2.setPhone("+91 99999 99999");
		emp2.setAddress("Southern Shores");
		emp2.setSalary(30000);
		
		//System.out.println("Employee Details: "+emp);
		
		// Hibernate API's
		//1. Configure Hibernate
		Configuration config = null;
		AnnotationConfiguration aConfig;
		
		//2. SessionFactory
		SessionFactory factory = null;
		
		//3. Session
		Session session = null;
		
		//4. Transaction
		Transaction transaction = null;
		
		try {
			
			//config = new Configuration();
			//config.configure(); // Read the hibernate.cfg.xml file
			//config.configure("myfile.xml");
			
			aConfig = new AnnotationConfiguration();
			aConfig.configure();
			
			//factory = config.buildSessionFactory();
			factory = aConfig.buildSessionFactory();
			
			session = factory.openSession();
		
			transaction = session.beginTransaction();
			
			// Insert
			//session.save(emp1); // Insert the data into Table
			//session.save(emp2); // Insert the data into Table
			
			// Retrieve Single Record
			//Employee e = (Employee)session.get(Employee.class, 1);
			//System.out.println("e is: "+e);
			//System.out.println("e name: "+e.getName());
			
			// Retrieve All
			//1. HQL | Hibernate Query Language
			/*String hql = "From Employee where salary > 40000";
			List<Employee> empList = session.createQuery(hql).list();
			for(Employee emp : empList){
				System.out.println(emp);
				System.out.println("---------------------------------");
			}*/
			
			//2. Criteria
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 40000));
			List<Employee> empList = criteria.list();
			for(Employee emp : empList){
				System.out.println(emp);
				System.out.println("---------------------------------");
			}*/
			
			Employee e1  = (Employee)session.get(Employee.class, 2);//= new Employee();
			Employee e2  = (Employee)session.get(Employee.class, 3);
			
			Employee e3  = (Employee)session.get(Employee.class, 2);
			
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e3);
			
			//emp.setId(1);
			//emp.setName("John Watson");
			//emp.setSalary(67500);
			
			//session.update(emp);
			
			//session.delete(emp);
			
			//session.save(emp1);
			//session.save(emp2);
			
			//transaction.commit();
			
			session.close(); // Clearing the data from Cache i.e. Session Object
			factory.close(); // Clearing the data from Cache i.e. SessionFactory Object
			
			System.out.println("Transaction Committed...");
		
			
		} catch (Exception e) {
			e.printStackTrace();
			
			//transaction.rollback();
		}
		
		
		int i = 10; // PT
		Integer iReff = i; // AutoBoxing
		Integer iRef = new Integer(i); // RT // Boxing
		
		char ch = 'A';
		Character chRef = new Character(ch); // Boxing
		
		int j = iReff; // Auto UnBoxing
		int k = iRef.intValue(); // UnBoxing
		
		char ch1 = chRef.charValue();
				
		
		
	}

}
