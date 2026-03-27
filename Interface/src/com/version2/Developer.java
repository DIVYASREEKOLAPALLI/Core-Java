package com.version2;

public class Developer {
//	private Laptop laptop;
//
//	public Developer(Laptop laptop) {
//		super();
//		this.laptop = laptop;
//	}
//	public void startCoding()
//	{
//		laptop.codeInLaptop();
//	}
	
	
	private Desktop desktop;

	
	public Developer(Desktop desktop) {
	super();
	this.desktop = desktop;
	}


	public void startCoding()
	{
		desktop.codeInDesktop();
	}
}
