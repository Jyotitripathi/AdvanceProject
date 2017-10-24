package com.auribises;

class Parent{
	void purchaseBike(){
		System.out.println("Lets purchase Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println("Lets buy maruti");
	}
}

class Child extends Parent{
	void purchaseBike(){
		System.out.println("Lets purchase Enfield");
	}
	
	static void purchaseCar(){
		System.out.println("Lets buy honda");
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.purchaseBike();
		
		Child.purchaseCar();
	}

}
