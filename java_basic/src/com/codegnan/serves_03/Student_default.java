package com.codegnan.serves_03;

public class Student_default {
		static char clg;
		byte age;
        short yearofpassing;
        int rollno;
        long phno;
        float height;
        double fee;
        char gender;
        boolean is_pass;
        
        public static void main(String[] args) {
        	System.out.println("college:"+Student_default .clg);
        	Student_default  obj = new Student_default ();
        	System.out.println(obj); //packagename+classname+hexadecimal
        	
        	System.out.println("age:"+obj.age);
        	System.out.println("yearofpassing:"+obj.yearofpassing);
        	System.out.println("rollno:"+obj.rollno);
        	System.out.println("phno:"+obj.phno);
        	System.out.println("height:"+obj.height);
        	System.out.println("fee:"+obj.fee);
        	System.out.println("gender:"+obj.gender);
        	System.out.println("is_pass:"+obj.is_pass);
        }
}
