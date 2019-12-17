package com.example.santinato.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HeaderServiceRevised {
	private String readFromPath(Path percorso) throws IOException {
		// Path percorso = Paths.get("C:", "Temp", "Header.txt");
		 String testo = null;
		  
		 try (BufferedReader lettoreFile = Files.newBufferedReader(percorso)) {
			String line;
			while ((line = lettoreFile.readLine()) != null) {
					testo = line;
			}
		 }
		 
		return testo;
	}
	
	private String readHeaderFromFile() throws IOException {
		  List<Path> listaDir = new ArrayList<Path>();
		  listaDir.add(Paths.get("C:", "Temp", "Header.txt"));
		  listaDir.add(Paths.get("C:", "Utenti", "Header.txt"));
		  listaDir.add(Paths.get("C:", "Programmi", "Header.txt"));
		  
		  for (Path percorso : listaDir) {
			try {
				String testo = readFromPath(percorso);
				if (testo != null) {
					return testo;
				}
				System.out.println("INFO: il file " + percorso + " è vuoto");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return null;
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
