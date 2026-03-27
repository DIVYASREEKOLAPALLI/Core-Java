package com.object.version1;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString(){
	return id+" "+name+" "+salary;
		
	}
	

}
