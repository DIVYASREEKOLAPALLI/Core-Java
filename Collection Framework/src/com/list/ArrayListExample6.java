package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Divya sree");
		list.add("Anand Kumar");
		list.add("Suguna");
		list.add("Ram");
		list.add("Anand Kumar");
		list.add("Ram");
		
		System.out.println(list.indexOf("Anand Kumar"));
		
		System.out.println(list.indexOf("mahi"));
		
		System.out.println(list.lastIndexOf("Anand Kumar"));
		
		System.out.println(list.contains("Anand"));     //contains method-----> it prints the boolean value if the value or string with in the object i return true otherwise false
		
		System.out.println(list.contains("Anand Kumar"));

	}

}
