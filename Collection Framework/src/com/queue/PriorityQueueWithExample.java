package com.queue;

import java.util.PriorityQueue;

public class PriorityQueueWithExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue =new PriorityQueue<Integer>();
		 
		queue.add(89);
		queue.add(14);
		queue.add(-17);
		queue.add(50);
		queue.add(-45);
		queue.add(63);
		
		
		while(queue.size()>0)
		System.out.println(queue.remove());
		//System.out.println(queue.remove(queue));

	}

}
