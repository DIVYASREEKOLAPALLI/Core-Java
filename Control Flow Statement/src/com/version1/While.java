package com.version1;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("enter your name to get wishes");
			System.out.println("enter exit to exit from program");
			String name = sc.nextLine();
			
			if(name.equals("exit")) {
				break;
			}
			else {
				System.out.println("Hello"+name+"good morning...");
			}
			
		}
		

	}

}
