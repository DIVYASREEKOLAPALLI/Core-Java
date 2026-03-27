package com.version2;

public class Test {

	public static void main(String[] args) {
		User divya = new User();
		divya.getFood(new Zomoto());
		
		User sree = new User();
		sree.getFood(new Swiggy());
		
		User sai = new User();
		sai.getFood(new KFC());

	}

}
