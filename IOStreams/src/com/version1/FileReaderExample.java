package com.version1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("D:\\Files\\Bhavana.txt");){
			int ch = 0;
			while((ch=reader.read())!=1) {
				System.out.println((char)ch);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		

	}

}
