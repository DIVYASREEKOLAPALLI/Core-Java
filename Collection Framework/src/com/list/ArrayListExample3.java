package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
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
