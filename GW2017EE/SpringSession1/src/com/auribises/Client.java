package com.auribises;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		// Traditional Way
		Student s1 = new Student();
		s1.setRoll(101);
		s1.setName("John");
		s1.setAge(20);
		
		System.out.println(s1);
		
		// Spring Way
		// IOC | Inversion Of Control
		
		// Procedure
		// 1. Link Jar files for Spring Core
		// 2. Copy XML file to src directory, where we shall configure our objects
		// 3. Use SpringContainer to get the object access
		//    BeanFactory
		//    ApplicationContext
		
		//Resource resource = new ClassPathResource("studentbean.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		//Student stu1 = (Student)factory.getBean("s2");
		//Student stu2 = factory.getBean("s3",Student.class);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("studentbean.xml");
		
		Student stu1 = (Student)context.getBean("s2");
		
		Student stu2 = (Student)context.getBean("s2");
		System.out.println("student details: "+stu1);
		System.out.println("student details: "+stu2);
		
		
	//Student stu2 = context.getBean("s3",Student.class);
	//	System.out.println("student details: "+stu2);
		
		
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}

}
