package com.example.astolfi.exception;

import java.io.IOException;

public class HeaderMainRevised {
	public static void main(String[] args) throws IOException {
		HeaderServiceRevised headerService = new HeaderServiceRevised();
		
		String header = headerService.getHeader();
		
		System.out.printf("%s\n", header);
		System.out.printf("Benvenuti nel nostro sito\n");
	}
}
