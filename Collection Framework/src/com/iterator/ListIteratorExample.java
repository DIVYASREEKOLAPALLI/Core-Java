package com.iterator;

import java.util.ListIterator;
import java.util.List;

//import com.boxing.Interger;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<Integer> list = List.of(10,20,30,40,50,60);
		ListIterator<Integer>  it = list.listIterator();
		 //Iterator<Integer>  it = list.Iterator();
//		while(it).hasNext()) {
//			System.out.println(it.next);
		//}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}

	}

}
