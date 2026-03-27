package com.codegnan.serves_02;

public class InstanceVariable {
	int age;
	String name;
    public static void main(String[] args) {
    	InstanceVariable obj = new InstanceVariable();
    	System.out.println(obj);//packagename+calssname+hexadecimal
    	obj.age=6;
    	obj.age=4;
    	System.out.println(obj.age);
    	System.out.println(obj.name);
    	
        InstanceVariable obj1 = new InstanceVariable();
    	obj1.age=21;
    	obj1.name= "divya";
    	System.out.println(obj1.age);
    	System.out.println(obj1.name);
    	
    }
}
   

