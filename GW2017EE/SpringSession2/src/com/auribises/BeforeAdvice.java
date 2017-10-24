package com.auribises;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.validation.DataBinder;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objArr, Object obj) throws Throwable {
		
		System.out.println("---before executed---");
		
		System.out.println("Before TimeStamp: "+new Date());
		
		System.out.println("Method Name: "+method.getName());
		
		//Inputs to the Method
		for(Object o : objArr){
			System.out.println(o);
		}
		
		// Referece to the Obejct
		System.out.println(obj);
		
		System.out.println("**********************");
	}

}
