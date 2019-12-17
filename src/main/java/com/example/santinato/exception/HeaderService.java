package com.example.santinato.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HeaderService {

	private String readHeaderFromFile() throws IOException {
		  Path percorso = Paths.get("C:", "Temp", "Header.txt");
		 String testo = null;
		  
		 try (BufferedReader lettoreFile = Files.newBufferedReader(percorso)) {
			String line;
			while ((line = lettoreFile.readLine()) != null) {
					testo = line;
			}
		 }
		 
		return testo;
	}
	
	public String getHeader()  {
		
		String testo;
		try {
			testo = this.readHeaderFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			testo = null;
		}  
		
		return testo;
	}
}
