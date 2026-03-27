package com.iterator;

import java.util.Iterator;
import java.util.List;



public class IteratorExample {

	public static void main(String[] args) {
		List<Integer> list = List.of(10,20,30,40,50,60);
		Iterator<Integer>  it = list.iterator();
		// Iterator<Integer>  it = list.Iterator();
		while(it.hasNext()) {
			System.out.println(it.next())	;
		}
		

	}

}
