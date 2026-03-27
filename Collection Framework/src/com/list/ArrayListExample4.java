package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Divya sree");
		list.add("Anand Kumar");
		list.add("Suguna");
		list.add("Ram");
		list.add("Anand Kumar");
		list.add("Ram");
		
		list.set(4, "sam");
		list.set(5, "ramya");
		
		for(String name: list) {
			System.out.print(name+" ;");
		}
		

	}

}
