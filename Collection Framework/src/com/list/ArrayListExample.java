package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Divya sree");
		list.add("Anand Kumar");
		list.add("Sam");
		list.add("Ram");
		list.add("Anand Kumar");
		list.add("Ram");
		
		for(String name: list) {
			System.out.println(name+" ;");
		}
		

	}

}
