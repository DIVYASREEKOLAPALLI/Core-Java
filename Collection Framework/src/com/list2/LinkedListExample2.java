package com.list2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Divya sree");//0
		list.add("Anand Kumar");//1
		list.add("Suguna");//2
		list.add("Ram");//3
		list.add("Anand Kumar");//4
		list.add("Ram");//5
		list.addFirst("Prakash");
		
		
		for(String name: list) {
			System.out.println(name+" ;");
		}
		

	}

}
