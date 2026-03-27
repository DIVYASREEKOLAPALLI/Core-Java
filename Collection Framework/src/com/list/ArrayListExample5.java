package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Divya sree");
		list.add("Anand Kumar");
		list.add("Suguna");
		list.add("Ram");
		list.add("Anand Kumar");
		list.add("Ram");
		
		System.out.println(list.size());  //size--> no.of collection in a object
		
		list.remove(5);  //removes the index name
		list.remove("Divya sree");
		
		for(String name: list) {
			System.out.print(name+" ;");
		}
		

	}

}
