package com.interthread;


public class Producer extends Thread {
	private Cubbyhole cb;
	public Producer(Cubbyhole cb) {
		this.cb = cb;
	}
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Producer insterd item "+i);
			cb.put(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
