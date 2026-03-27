package com.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<Integer>queue = new ArrayDeque<Integer>();
		
		queue.add(70);
		queue.addFirst(80);
		queue.add(88);
		queue.addFirst(90);
		queue.remove();
		queue.addFirst(100);
		queue.removeLast();
		queue.remove();
		queue.addFirst(110);
		queue.add(73);
		queue.addFirst(89);
		queue.addFirst(180);
		queue.removeLast();
		queue.removeLast();
		queue.add(801);
		queue.removeLast();
		
		for(int x:queue) {
			System.out.println(x);
		}
		

	}

}
