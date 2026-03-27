package com.version2;

public class Test {

	public static void main(String[] args) {
		Manager obj = new Manager();
		
		obj.setId(111);
		obj.setName("divya sree");
		obj.setSalary(75000.00);
		
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getSalary());

	}

}
