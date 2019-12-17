package com.example.crespan.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HeaderService {
	
	private String readHeader() throws FileNotFoundException {
		String s=null;
		try(Scanner scan=new Scanner(new File("C:\\Temp\\header.txt"))){
		s=scan.nextLine();
		scan.close();
		}
		return s;
	}
	
	public String getHeader() {
		try {
			return readHeader();
		}catch (IOException ioe) {
			ioe.printStackTrace();
			return "non trovato header";
		}
	}
	
	public static void main(String[] args) {
		HeaderService hs=new HeaderService();
		System.out.println(hs.getHeader());
	}
	
}
