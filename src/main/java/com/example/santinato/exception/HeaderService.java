package com.example.santinato.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HeaderService {
	private String readHeaderFromFile() throws IOException {
		  Path percorso = Paths.get("C:", "Temp", "Header.txt");
		  String Testo = null;
		  
		  try (BufferedReader lettoreFile = Files.newBufferedReader(percorso)) {
				String line;
				while ((line = lettoreFile.readLine()) != null) {
					Testo = line;
				}
		  }
		return Testo;
	}
	
	public String getHeader() throws IOException  {
		
		String Testo = this.readHeaderFromFile(); 
		return Testo;  
	}
}
