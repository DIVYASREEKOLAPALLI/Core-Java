package com.interthread;
import java.util.Iterator;

public class Consumer extends Thread {
	private Cubbyhole cb;
	public Consumer(Cubbyhole cb) {
		this.cb = cb;
 }
	public void run() {
		for(int i=1; i<=10; i++) {
			int item = cb.get();
			System.out.println("Consumer got item"+item);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
		}
	}
	
	}
}
