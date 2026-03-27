package com.object.version1;

public class Test {

	public static void main(String[] args) {
		Employee obj = new Manager(111, "Anand", 85000.00);  
		
		
		System.out.println(obj);   // it calls obj.toString()
		System.out.println(obj.toString()); 
		
	}

}
