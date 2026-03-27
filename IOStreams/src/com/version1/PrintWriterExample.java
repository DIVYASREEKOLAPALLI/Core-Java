package com.version1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		try (PrintWriter write =new PrintWriter("D:\\Files\\bashi.txt");
				
				){
			
			String data="Bashi is a good boy\n";
			data=data + "Bashi likes Dhuranadar\n";
			data=data+"Bashi is from Karachi";
			write.write(data);
			
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}