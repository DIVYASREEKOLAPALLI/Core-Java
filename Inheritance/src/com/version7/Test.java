package com.version7;

public class Test {

	
	public static void main(String[] args) {
		Employee obj1 = new Employee(143,"Variety munny", 850000.00);
		Employee obj2 = new Employee(143,"Variety munny", 850000.00);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.equals(obj2));
		
		System.out.println(obj1.equals(null));
		
		Thread t1 =new Thread();
		
		System.out.println(obj1.equals(t1));
	}

}
