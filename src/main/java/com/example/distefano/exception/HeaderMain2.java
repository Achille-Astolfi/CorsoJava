package com.example.distefano.exception;

import java.io.IOException;

public class HeaderMain2 {

	public static void main(String[] args) throws IOException {
		HeaderServiceRevised header = new HeaderServiceRevised(); 
		System.out.println(header.getHeader());
	}
}