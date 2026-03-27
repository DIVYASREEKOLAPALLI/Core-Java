package com.version7;

public class Test {

	public static void main(String[] args) {
		Wakable obj1;
		Swimmable obj2;
		Flyable obj3;
		Jumable obj4;
		
		obj1=new Human();
		obj1.walk();
		obj1=new Parrot();
		obj1.walk();
		
		obj2=new Human();
		obj2.swim();
		obj2=new Frog();
		obj2.swim();
		
		
		
		obj3=new Parrot();
		obj3.fly();
		
		
		obj4=new Human();
		obj4.jump();
		obj4=new Frog();
		obj4.jump();
		

	}

}
