package com.version1;
import java.util.Scanner;

public class Single_DimArray5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int marks[]= new int[6];
		
	
		
		for(int index=0 ; index<marks.length; index++) {
			System.out.println("enter value at index"+index);
			marks[index]=sc.nextInt();
			
		}
		
		
		for(int index=0 ; index<marks.length; index++) {
			System.out.print(marks[index]+" ");
			
		}
		
	

	}

}
