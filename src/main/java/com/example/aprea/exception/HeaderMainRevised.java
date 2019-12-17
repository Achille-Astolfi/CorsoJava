package com.example.aprea.exception;

import java.io.IOException;

public class HeaderMainRevised {
	public static void main(String[] args) {
		HeaderServiceRevised headerServiceRevised = new HeaderServiceRevised();
		
		String header = headerServiceRevised.getHeader();
		
		System.out.printf("%s\n", header);
		System.out.printf("Benvenuti nel nostro sito\n");		
	}
}
