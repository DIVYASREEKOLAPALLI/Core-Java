package com.version7;

public class Human implements Wakable, Swimmable, Jumable{

	@Override
	public void swim() {
		System.out.println("human can swim");
		
	}

	@Override
	public void jump() {
		System.out.println("human can jump");
		
	}

	@Override
	public void walk() {
		System.out.println("human can walk");
	}

}
