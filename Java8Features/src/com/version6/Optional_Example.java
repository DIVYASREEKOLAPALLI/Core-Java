package com.version6;

import java.util.Optional;

public class Optional_Example {
	 public static void main(String[] args) {
		 String names[]= {"Bhagyamma",null,"Bashi",null,"Vidya",null,"Akash",null,"Anand",null,"Anjum",null,"Bhavana",null,"Gowry"};
		 
		 
//		 for(String name: names) {
//			 if(name!=null) {
//				 System.out.println(name.toUpperCase());
//		
//			 }
//			 else {
//				 System.out.println("Null value found");
//			 }
//		 }
		 
//		 for(String name: names) {
//			 try {
//				 System.out.println(name.toUpperCase());
//		
//			 }
//			 catch(NullPointerException e) {
//				 System.out.println("Null value found");
//			 }
//		 }
		 
//		 for(String name: names) {
//			 Optional<String> optional = Optional.ofNullable(name);
//			 optional.ifPresent(v->System.out.println(v.toUpperCase()));
//		 }
		 
		 for(String name: names) {
			 Optional<String> optional = Optional.ofNullable(name);
			 optional.ifPresentOrElse(v->System.out.println(v.toUpperCase()), ()-> System.out.println("NULL value found"));
		 }
		 
		 
		 
		 
		 
	 }

}
