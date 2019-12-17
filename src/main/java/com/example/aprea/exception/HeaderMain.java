package com.example.aprea.exception;

import java.io.IOException;

public class HeaderMain {
	public static void main(String[] args) {
		HeaderService headerService = new HeaderService();
		
		String header = headerService.getHeader();
		
		System.out.printf("%s\n", header);
		System.out.printf("Benvenuti nel nostro sito\n");		
	}
}
