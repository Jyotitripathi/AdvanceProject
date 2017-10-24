package com.auribises.main;

import com.auribises.bean.Customer;
import com.auribises.bean.Product;

public class User {

	public static void main(String[] args) {
		
		Product p1 = new Product(1001,"5 Star",10,"Cadbury",10);
		Product p2 = new Product();
		p2.setBarcode(3750);
		p2.setName("Hide&Seek");
		
		Customer c1 = new Customer();
		c1.setName("John Watson");
		c1.setGender('M');
		
		int i = 10; // 10 is a Value | its a Literal
		int j = 10;
		int[] arr = {10,20,30,40,50};
		
		int k = i;				// Value Copy
		int[] someArr = arr;    // Reference Copy
		
		
		//p1 = null;
		//System.gc();
		
		someArr[2] = 100;
		
		System.out.println(i);
		System.out.println(arr);
		
		
		System.out.println(arr[2]);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(c1);
		
		System.out.println(p1.getBarcode()+" - "+p1.getName());
		System.out.println(p2.getBarcode()+" - "+p2.getName());
		System.out.println(c1.getName()+" - "+c1.getGender());
		

	}

}
