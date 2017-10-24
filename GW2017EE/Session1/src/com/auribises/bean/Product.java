package com.auribises.bean;

//Bean or POJO(Plain Old Java Object) or Model
public class Product {
	
	// Attributes
	int barcode;
	String name;
	int price;
	String brand;
	int weight;
	
	public Product(){
		
	}
	
	public Product(int barcode, String name, int price, String brand, int weight) {
		this.barcode = barcode;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.weight = weight;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
