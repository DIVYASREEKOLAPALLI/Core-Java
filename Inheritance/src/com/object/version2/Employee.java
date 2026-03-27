package com.object.version2;

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
	public boolean equals(Object obj) {
		if(obj ==null) {
			return false;
		}else if(this.getClass()!= obj.getClass()) {
			return false;
		}
		else {
			Employee sc =(Employee)obj;
			if(this.id == sc.id && this.name == sc.name && this.salary == sc.salary){
			return true;
		}
			else {
				return false;
			}
		}
		
	}

}
