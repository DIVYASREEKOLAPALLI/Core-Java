package com.codegnan.serves_03;

public class Student {
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
        	System.out.println(Student.clg);
            Student obj = new Student();
        	System.out.println(obj); //packagename+calssname+hexadecimal
        	obj.age=21;
        	obj.yearofpassing=2026;
        	obj.rollno=91;
        	obj.phno=8978919140L;
        	obj.height=5.4f;
        	obj.fee= 200000;
        	obj.gender=1;
        	obj.is_pass= true;
        	System.out.println(obj.age);
        	System.out.println(obj.yearofpassing);
        	System.out.println(obj.rollno);
        	System.out.println(obj.phno);
        	System.out.println(obj.height);
        	System.out.println(obj.fee);
        	System.out.println(obj.gender);
        	System.out.println(obj.is_pass);
        }
}
