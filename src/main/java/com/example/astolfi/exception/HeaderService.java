package com.example.astolfi.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HeaderService {
	
	
	private String readHeaderFromFile() throws IOException {
		// apre un BufferedReader sul file C:\Temp\header.txt e restituisce il contenuto
		// della prima riga
		Path path = Paths.get("C:", "Temp", "header.txt");
		
		String firstLine;
		try (BufferedReader br = Files.newBufferedReader(path)) {
			firstLine = br.readLine();
		}
		
		return firstLine;
	}
	
	public String getHeader() {
		// invoca il metodo readHeaderFromFile e restituisce il valore ottenuto
		
		// non è un termine tecnico; scritto così (prima di gestire l'eccezione) è il 
		// classico "metodo passacarte"
		// Adesso che gestisco l'eccezione do finalmente un senso a questo metodo
		String header;
		try {
			header = this.readHeaderFromFile();
		} catch (IOException e) {
			// inizializzo header in modo alternativo
			header = "Nuovo Sito Aziendale";
		}
		return header;
	}
}
