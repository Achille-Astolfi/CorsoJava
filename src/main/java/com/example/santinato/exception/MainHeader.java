package com.example.santinato.exception;

import java.io.IOException;

public class MainHeader {
	public static void main(String[] args) throws IOException {
		
		// Uso l'HeaderService semplificato
		HeaderService headerService = new HeaderService();
		System.out.println("Ecco cosa ho letto usando il metodo semplificato: \n" + headerService.getHeader() + "\n");
		
		// Uso l'HeaderService avanzato
		HeaderServiceRevised headerServiceAdvanced = new HeaderServiceRevised();
		System.out.println("Ecco cosa ho letto usando il metodo avanzato: \n" + headerService.getHeader() + "\n");
	}
}
