package com.example.distefano.exception;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeaderServiceRevised {
	private String readHeaderFromPath(Path path) throws IOException {
		try (Scanner scanner = new Scanner(path)) {
			if (scanner.hasNextLine() && !scanner.nextLine().trim().isEmpty()) {
				return scanner.nextLine();
			}
		}
		return null;
	}
	
	private String readHeaderFromFiles() {
		List<Path> paths = new ArrayList<Path>();
		paths.add(Paths.get("C:", "Windows", "System32", "drivers", "etc", "header.txt"));
		paths.add(Paths.get("C:", "Temp", "header.txt"));
		
		for (Path p : paths) {
			try {
				String header = readHeaderFromPath(p);
				if (header != null) {
					return header;
				}
				System.out.println("In " + p + " non è scritto niente");
			} catch (IOException exc) {
				System.out.println("Lettura di " + p + " non riuscita");
			}
		}
		return "Nessuna lettura riuscita";
	}

	public String getHeader() {
		return readHeaderFromFiles();
	}
}