package com.list2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Divya sree");
		list.add("Anand Kumar");
		list.add("Sam");
		list.add("Ram");
		list.add("Anand Kumar");
		list.add("Ram");
		
		for(String name: list) {
			System.out.print(name+"   ");
		}
		

	}

}
