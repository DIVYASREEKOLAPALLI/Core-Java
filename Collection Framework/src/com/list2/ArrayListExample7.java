package com.list2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample7 {

	public static void main(String[] args) {
		List<Integer> list = List.of(-111, 432, 789, 435, 894, -999, 145, 874, 159, 481);
		
		ArrayList<Integer> al = new ArrayList<Integer>(list);
		
		System.out.println(list);
		
		Collections.sort(al);
		System.out.println(al);
		

	}

}
