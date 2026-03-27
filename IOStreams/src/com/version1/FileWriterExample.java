package com.version1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExample {

	public static void main(String[] args) {
		
		try (FileWriter writer = new FileWriter("D:\\Files\\Mounika.txt");){
			String data = "Mounika is a good girl\n";
			data = "Mounika like bobbatulu\n";
			data = "Mounika from Bihar";
			writer.write(data);
			int ch = 0;
			
			}
		
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		

	}

}
