package com.sync;

public class BookMyShow  implements Runnable{
	private int available = 1;
	private int wanted;
	
	public BookMyShow(int wanted) {
		super();
		this.wanted = wanted;
	}

	@Override
	public void run() {
		synchronized(this) {
			
		String name = Thread.currentThread().getName();
		
		if(wanted<= available) {
			System.out.println("Tickets booked for" +name);
			available=available-wanted;
		}else {
			System.out.println("Sorry no tickets"+name);
		}
		
	}
  }
}


