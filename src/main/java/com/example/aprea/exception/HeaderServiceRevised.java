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
				String candidateHeader = scanner.nextLine();
				// BUG FIX: metodo trim rimuove tutti gli spazi iniziali e finali (con spazi qui si intendono tutti i caratteri invisibili: spazio, tabulazione, a capo ecc.)
				System.out.printf("TRACE length %d\n", candidateHeader.length());
				System.out.printf("TRACE trim.length %d\n", candidateHeader.trim().length());
				System.out.printf("TRACE code %d\n", (int) candidateHeader.charAt(0));
				// problema nel visionare come stringa nulla dopo il trim.

				if (!candidateHeader.trim().isEmpty()) {
					return candidateHeader; // se la riga letta non è vuota (dopo la rimozione degli spazi), allora return
				} else {
					return null;
				}
			}
		}
		// se arrivo qua vuol dire che il file era vuoto, posso decidere di sollevare un'eccezione oppure di restituire null
		return null;
	}
	
	private String readHeaderFromFiles(String fileName) {
		List<Path> paths = new ArrayList<>(); // lista di directory dove cercare il file
		paths.add(Paths.get("C:", "Windows", "System32", "drivers", "etc")); // elenco di directory, non di file, se tolgo header.txt devo quindi passarlo al metodo readHeaderFromFile
		paths.add(Paths.get("C:", "Temp"));
		
		for (Path p : paths) {
			try {
				// per aggiungere il nome del file a una Path si usa il metodo resolve
				String header = readHeaderFromPath(p.resolve(fileName));
				if (header != null) {
					return header;
				}
				// altrimenti lascio output informativo
				System.out.printf("Il file dentro %s è vuoto.\n", p); // qualsiasi cosa può essere trasformata in stringa. %s in automatico invoca il metodo .toString dell'oggetto a cui la variabile punta
			} catch (IOException e) {
				// non faccio nulla, passo all'elemento successivo, mi lascio un output informativo sulla console
				System.out.printf("INFO Non ho trovato il file dentro: %s\n", p);
			}
		}
		// se arrivo qui vuol dire che tutti i file erano vuoti o non esistevano
		// posso decidere di sollevare un'eccezione, oppure di restituire null
		return null;
	}
	
	public String getHeader() {
		String header = readHeaderFromFiles("header.txt");
		if (header != null) {
			return header;
		} else {
			return "Nuovo sito aziendale";
		}
	}
}
