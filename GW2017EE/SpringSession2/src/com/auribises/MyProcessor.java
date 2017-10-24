package com.auribises;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProcessor implements BeanPostProcessor{
	@Override
	public Object postProcessAfterInitialization(Object obj, String str) throws BeansException {
		System.out.println("--postProcessAfterInitialization-- "+str);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String str) throws BeansException {
		System.out.println("--postProcessBeforeInitialization-- "+str);
		return obj;
	}

}
