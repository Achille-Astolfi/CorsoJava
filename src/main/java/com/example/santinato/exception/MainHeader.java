package com.example.santinato.exception;

import java.io.IOException;

public class MainHeader {
	public static void main(String[] args) throws IOException {
		HeaderService headerService = new HeaderService();
		
		System.out.println(headerService.getHeader());
	}
}
