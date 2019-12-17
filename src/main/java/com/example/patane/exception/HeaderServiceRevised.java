package com.example.patane.exception;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeaderServiceRevised {
		
	private static String readHeaderFromPath(Path path) throws IOException {
		try (Scanner scan= new Scanner(path)) {
			if (scan.hasNextLine()) {
				return scan.nextLine();
			}
		}
		return null;
	}
	
	private String readHeaderFromFiles() {
		List<Path> paths= new ArrayList<>();
		paths.add(Paths.get("C:", "Windows", "System32", "drivers", "etc", "header.txt"));
		
		for (Path p: paths) {
			try {
				String header= readHeaderFromPath(p);
				if (header !=null) {
					return header;
				}
				System.out.println("il file " + p + " è vuoto");
			}catch (IOException e) {
				System.out.println("INFO non ho trovato " + p);
			}
		}
		return null;
	}
	
	public String getHeader() {
		String header= readHeaderFromFiles();
		if (header != null) {
			return header;
		} else  {
			return "Nuovo Sito Aziendele";
		}
	}
	
	
	public static void main(String[] args) {
		HeaderServiceRevised headerService = new HeaderServiceRevised();
		String header = headerService.getHeader();
		System.out.println(header);
		System.out.println("Benvenuti nel nostro sito ");
	}
}

