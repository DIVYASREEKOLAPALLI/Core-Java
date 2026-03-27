package com.interthread;

public class Test {

	public static void main(String[] args) {
		Cubbyhole cb =new Cubbyhole();
		
		Producer producer = new Producer(cb);
		Consumer consumer = new Consumer(cb);
		
		producer.start();
		consumer.start();

	}
	 

}
