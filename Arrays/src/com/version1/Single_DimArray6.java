package com.version1;
import java.util.Scanner;

public class Single_DimArray6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double marks[]= new double[6];
		
	
		
		for(int index=0 ; index<marks.length; index++) {
			System.out.println("enter value at index"+index);
			marks[index]=sc.nextDouble();
			
		}
		double total_marks=0.0;
		double avg = 0.0;
		
		
		
		for(int index=0 ; index<marks.length; index++) {
			total_marks = total_marks+ marks[index];
			
		}
		avg = total_marks/marks.length;
		
		System.out.println("total marks"+total_marks);
		System.out.println("average marks"+avg);
		
	

	}

}
