package com.example.aprea.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HeaderService {
	private String readHeaderFromFile() throws IOException {
		Path path = Paths.get("C:", "Temp", "header.txt");
		// con le righe sotto gestisco l'exception col try/catch direttamente in questo metodo, altrimenti sollevo una throw e la faccio gestire al metodo pubblico getHeader
//		try (BufferedReader br = Files.newBufferedReader(path)) {
//			String line = br.readLine();
//		} catch (IOException e) {
//			String line = "Titolo non trovato";
//		}
		String firstLine;
		try (BufferedReader br = Files.newBufferedReader(path)) {
		firstLine = br.readLine();
		}
		return firstLine;
	}
	
	public String getHeader() {
		// invoca il metodo readHeaderFromFile e restituisce il valore ottenuto
		// prima di gestire l'eccezione è il tipico metodo "passacarte"
//		return this.readHeaderFromFile();
		// Adesso che gestisco l'eccezione con try/catch do uin senso a questo metodo
		String header;
		try {
			header = this.readHeaderFromFile();
		} catch (IOException e) {
			header = "Nuovo sito aziendale";
		}
		return header;
	}
}

// uso i throws per rimbalzare l'exception fino al main, altrimenti la gestisco dove ho interesse.