package com.version1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamExample {

	public static void main(String[] args) {
		try (FileInputStream fis=new FileInputStream("D:\\Files\\Neha.txt");
				DataInputStream dis=new DataInputStream(fis);
				){
			
			String line = "";
			while((line = dis.readLine()) !=null) {
				System.out.println(line);
			}
			
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}