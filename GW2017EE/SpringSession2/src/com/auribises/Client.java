package com.auribises;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		// Traditional Way
		/*Address a = new Address();
		a.setAdrsLine("Krishna Nagar");
		a.setCity("Ludhiana");
		a.setState("Punjab");
		a.setZipCode(141002);
		
		//Person p = new Person(a);
		Person p = new Person();
		p.setId(101);
		p.setName("John");
		p.setAge(30);
		p.setAddress(a);
		
		System.out.println(p);*/
		
		// Spring Way
		// Core Container | BeanFactory or ApplicationContext
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		/*Person p1 = context.getBean("pers",Person.class);
		System.out.println(p1);
		
		Person p2 = context.getBean("pers1",Person.class);
		System.out.println(p2);

		
		Manager m1 = context.getBean("mgr",Manager.class);
		System.out.println(m1);
		
		System.out.println(m1.getCertificates());
		
		for(String str : m1.getCertificates()){
			System.out.println(str);
		}
		
		Child ch = context.getBean("cRef",Child.class);
		//System.out.println(ch);
		System.out.println(ch.getFname()+" "+ch.getLname());
		System.out.println(ch.getWealth());*/
		
		//Fruit f = context.getBean("fruit",Fruit.class);
		//f.getSeed().showSeed();
		
		//Address ad = context.getBean("adrs",Address.class);
		//System.out.println(ad);
		
		Employee emp = context.getBean("empProxy",Employee.class);
		emp.registerEmployee(105,"Jack JJ");
		
	}

}
