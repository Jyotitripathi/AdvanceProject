package com.auribises;

import org.springframework.beans.factory.annotation.Autowired;

public class Fruit {

	Seed seed; // HAS - A relation

	public Seed getSeed() {
		return seed;
	}

	@Autowired
	public void setSeed(Seed seed) {
		this.seed = seed;
	}
	
}
