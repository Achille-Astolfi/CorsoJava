package com.example.distefano.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HeaderService {
	private static String readHeaderFromFile() throws IOException {
		Path path = Paths.get("C:", "Temp", "header.txt");
		try (BufferedReader br = Files.newBufferedReader(path)) {
			return br.readLine();
		}
	}
	
	public static String getHeader() {
		try {
			return readHeaderFromFile();
		} catch (IOException e) {
			return "Lettura non riuscita";
		}
	}
}