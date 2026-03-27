package com.version7;

public class Parrot implements Flyable, Wakable{

	@Override
	public void walk() {
		System.out.println("human can walk");
		
	}

	@Override
	public void fly() {
		System.out.println("human can fly");
		
	}

}
