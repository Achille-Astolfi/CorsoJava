package com.example.aprea.exception;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeaderServiceRevised {
	private String readHeaderFromPath(Path path) throws IOException {
		// metodo alternativo di lettura usando Scanner
		try (Scanner scanner = new Scanner(path)) {
			if (scanner.hasNextLine()) {
				return scanner.nextLine();
			}
		}
		// se arrivo qua vuol dire che il file era vuoto, posso decidere di sollevare un'eccezione oppure di restituire null
		return null;
	}
	
	private String readHeaderFromFiles() {
		List<Path> paths = new ArrayList<>();
		paths.add(Paths.get("C:", "Windows", "System32", "drivers", "etc", "header.txt"));
		paths.add(Paths.get("C:", "Temp", "header.txt"));
		
		for (Path p : paths) {
			try {
				String header = readHeaderFromPath(p);
				if (header != null) {
					return header;
				}
				// altrimenti lascio output informativo
				System.out.printf("Il file %s è vuoto.\n", p); // qualsiasi cosa può essere trasformata in stringa. %s in automatico invoca il metodo .toString dell'oggetto a cui la variabile punta
			} catch (IOException e) {
				// non faccio nulla, passo all'elemento successivo, mi lascio un output informativo sulla console
				System.out.printf("INFO Non ho trovato: %s\n", p);
			}
		}
		// se arrivo qui vuol dire che tutti i file erano vuoti o non esistevano
		// posso decidere di sollevare un'eccezione, oppure di restituire null
		return null;
	}
	
	public String getHeader() {
		String header = readHeaderFromFiles();
		if (header != null) {
			return header;
		} else {
			return "Nuovo sito aziendale";
		}
	}
}
