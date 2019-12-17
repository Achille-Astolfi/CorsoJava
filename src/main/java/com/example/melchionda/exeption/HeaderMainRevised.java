package com.example.melchionda.exeption;
import java.io.IOException;

public class HeaderMainRevised {
		public static void main(String[] args) throws IOException {
			HeaderServiceRevised headerService = new HeaderServiceRevised();
			
			String header = headerService.getHeader();
			
			System.out.printf("%s\n", header);
			System.out.printf("Benvenuti nel sito \n");
		}
}
