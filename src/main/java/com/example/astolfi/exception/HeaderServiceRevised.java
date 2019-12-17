package com.example.astolfi.exception;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeaderServiceRevised {
	
	
	private String readHeaderFromPath(Path path) throws IOException {
		// metodo alternativo a BufferdReader
		try (Scanner scanner = new Scanner(path)) {
			if (scanner.hasNextLine()) {
				String candidateHeader = scanner.nextLine();
				// il metodo trim() di String elimina tutti gli "spazi" iniziali e finali
				// per "spazio" si intende "whitespace" ossia i caratteri nel range 0-32 di ASCII
				// e UTF-8, che comprende anche "tabulazione", "a capo" eccetera
				if (!candidateHeader.trim().isEmpty())  {
					return candidateHeader;
				} else {
					return null;
				}
			}
		}
		// se arrivo qui significa che il file era vuoto
		// posso decidere di sollevare un'eccezione
		// oppure di restituire null
		return null;
	}
	
	private String readHeaderFromFiles(String fileName) {
		List<Path> paths = new ArrayList<>(); // questa è una list di directory dove cercare il file
		paths.add(Paths.get("C:", "Windows", "System32", "drivers", "etc"));
		paths.add(Paths.get("C:", "Temp"));
		
		for (Path p : paths) {
			try {
				// per aggiungere il nome del file a una Path si usa il metodo resolve
				String header = readHeaderFromPath(p.resolve(fileName));
				if (header != null) {
					return header;
				}
				// altrimenti potrei lasciare un output informativo
				System.out.printf("INFO Il file dentro %s è vuoto.\n", p);
			} catch (IOException e) {
				// non faccio nulla, passo all'elemento successivo
				// mi lascio un output informativo sulla console
				System.out.printf("INFO Non ho trovato il file dentro: %s\n", p);
			}
		}
		// se arrivo qui: vuol dire che tutti i file erano vuoti o non esistevano
		// posso decidere di sollevare un'eccezione
		// oppure di restituire null
		return null;
	}
	
	public String getHeader() {
		String header = readHeaderFromFiles("header.txt");
		if (header != null) {
			return header;
		} else {
			return "Nuovo Sito Aziendale";
		}
	}
}
