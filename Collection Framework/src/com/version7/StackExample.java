package com.version7;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack =new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(40);
		stack.push(60);
		stack.push(80);
		stack.push(7);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.search(60));
		
		System.out.println(stack.empty());

	}

}
