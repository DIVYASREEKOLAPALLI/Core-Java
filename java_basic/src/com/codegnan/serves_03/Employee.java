package com.codegnan.serves_03;

public class Employee {
	static char company;
	byte age;
    short experience;
    int emp_id;
    long phno;
    float height;
    double salary;
    char gender;
    boolean in_company;
    
    public static void main(String[] args) {
    	System.out.println("college:"+Employee .company);
    	Employee obj = new Employee ();
    	System.out.println(obj); //packagename+classname+hexadecimal
    	
    	System.out.println("age:"+obj.age);
    	System.out.println("experience:"+obj.experience);
    	System.out.println("emp_id:"+obj.emp_id);
    	System.out.println("phno:"+obj.phno);
    	System.out.println("height:"+obj.height);
    	System.out.println("salary:"+obj.salary);
    	System.out.println("gender:"+obj.gender);
    	System.out.println("in_company:"+obj.in_company);
    }

}
