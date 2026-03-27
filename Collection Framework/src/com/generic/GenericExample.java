package com.generic;

public class GenericExample {
	public static <T> void display(T arr[]) {
		for(T x:arr) {
			System.out.println(x);
			
		}
	}

	public static void main(String[] args) {
		Integer obj1[]= {10,20,30,40};
		display(obj1);

	}
	
	public static void main(String[] args) {
		Double obj2[]= {"goa","divya","vij"};
		display(obj2);

	}


}
