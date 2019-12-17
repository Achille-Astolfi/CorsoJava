package com.example.patane.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class HeaderService {
	private static String readHeaderFromFile() throws IOException  {
		
		try (Scanner scan= new Scanner(new File("C:\\Temp\\Header.txt")))
		{ if (scan.hasNextLine()) 
			{
				return scan.nextLine();
			}
		

		}
		return null;
	}
	
	public static String getHeader() {
		try {
			return readHeaderFromFile();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("ecco a voi: " + getHeader());
	}
}
	


