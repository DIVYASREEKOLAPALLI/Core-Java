package com.list2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample3 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Divya sree");
		list.add("Anand Kumar");
		list.add("Suguna");
		list.add("Ram");
		list.add("Anand Kumar");
		list.add("Ram");
		list.add(2,"meghana");
		
		for(String name: list) {
			System.out.print(name+" ;");
		}
		System.out.println();
		System.out.println(list.get(4));
		

	}

}
