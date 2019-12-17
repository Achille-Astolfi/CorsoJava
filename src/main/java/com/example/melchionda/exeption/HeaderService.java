package com.example.melchionda.exeption;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


// il metodo public passa dati di input all altro metodo che è private
// il public gestirà anche le eccezioni
public class HeaderService {
	private String readHeaderFromFile() throws IOException {
		// apre un BufferedReader sul file C:\Temp\header.txt e restituisce il contenuto della prima riga
		Path path = Paths.get("c:", "Temp", "header.txt");
		
		String firstLine;
		try (BufferedReader br = Files.newBufferedReader(path)) {
			firstLine = br.readLine();
	}	
		return firstLine; 
	}

	public String getHeader()  {
		// invoca il metodo readHeaderFromFile e restituisce il valore ottenuto
		
		
		// prima di gestire l'eccezione è il metodo "passacarte"
		// aggiungiamo con try catch la gestione dell'eccezione
		// adesso che gestisco l'eccezione do finalmente un senso a questo metodo
		// la Security exception non è obbligatoria
		String header;
		try {
			header = this.readHeaderFromFile();
		} catch (IOException e) {
			// inizializzo header in maniera alternativa oppure faccio return secco
			header = "Nuovo sito aziendale";
		}
		return header;
		
	}
}
