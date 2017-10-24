package com.auribises;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object obj1, Method method, Object[] objArr, Object obj2) throws Throwable {
		System.out.println("---after executed---");
		
		System.out.println(method.getName());
		
		for(Object o : objArr){
			System.out.println(o);
		}
		
		System.out.println("obj1: "+obj1);
		System.out.println("obj2:" +obj2);
		
		// Play with Data | Encryption/Decryption Here
		Employee e = (Employee)obj2;
		int id = e.eid;
		String nm = e.ename;
		
		System.out.println("After TimeStamp: "+new Date());
		
		System.out.println("**********************");
	}

}
