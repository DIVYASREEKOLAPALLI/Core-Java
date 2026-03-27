package com.version7;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int i, String string, double d) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
			
		}
		else if(this.getClass()  != obj.getClass()) {
			return false;
			
		}else {
			Employee emp =(Employee)obj;
			if(this.id == emp.id && this.name == emp.name && this.salary == emp.salary);
			 return true;
			 
		}else {
			return false;
			
		}
	}
	
	
	
	

}
