package com.auribises;

public class CTPDemom {

	void fun(){
		System.out.println("This is fun");
	}
	
	int fun(int a, int b){
		System.out.println("This is a real fun");
		return 0;
	}
	
	void fun(int a){
		System.out.println("This is fun again");
	}
	
	void fun(float f){
		System.out.println("Funny Fun");
	}
	
	
	void fun(int a, float f){
		
	}
	
	void fun(float a, int f){
		
	}
	
	public static void main(String[] args) {
		
		CTPDemom ct = new CTPDemom();
		ct.fun();
		ct.fun(10);
		ct.fun(10.1f);
		
	}

}
