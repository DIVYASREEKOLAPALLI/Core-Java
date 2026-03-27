package com.list2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample5 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
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
