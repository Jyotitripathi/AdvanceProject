package com.auribises;

// Web Service
public class Register {

	// Web Methods
	public String registerUser(String name){
		// Some registration code goes here
		String str = "Dear, "+name+" You are registered successfully";
		return str;
	}
	
	public int INRToDollars(int inr){
		// Some code which must always check equivalence of inr with dollar
		int dollars = inr/65;
		return dollars;
	}
	
	public int getWearther(String city){
		if(city.equals("Ludhiana")){
			return 30;
		}else{
			return 0;
		}
	}
}
