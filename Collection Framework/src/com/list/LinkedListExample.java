package com.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Divya sree");
		list.add("Anand Kumar");
		list.add("Suguna");
		list.add("Ram");
		list.add("Anand Kumar");
		list.add("Ram");
		
		list.set(4, "sam");
		list.set(5, "ramya");
		
		for(String name: list) {
			System.out.println(name+" ;");
		}
		

	}

}
