package com.ntapi.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample {

	public static void main(String[] args) throws IOException{
		FileReader fr = null;
		BufferedReader reader = null;

//		try {
			fr = new FileReader("E:\\OneDrive\\Desktop\\Devraj\\eclipse.txt");
			reader = new BufferedReader(fr);
			String line = null;
			
			while((line = reader.readLine()) != null ){
				System.out.println(line);
			}
//		}catch(IOException ioe) {
//			System.out.println("Trouble reading from the file: " + ioe.getMessage());
//		}
			reader.close();
	}

}
