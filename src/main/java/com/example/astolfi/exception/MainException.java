package com.example.astolfi.exception;

public class MainException {
	public static void main(String[] args) {
		// creo un oggetto TestException
		TestException testException = new TestException();
		// testo quello che devo testare
		if (testException.isNthFibonacci(0, 0)) {
			System.out.printf("0 è lo 0-simo numero di Fibonacci.\n");
		} else {
			System.out.printf("0 non è lo 0-simo numero di Fibonacci.\n");
		}
		// faccio un altro test - nota bene: il copia-e-incolla non è il benvenuto
		if (testException.isNthFibonacci(2, 4)) {
			System.out.printf("4 è il secondo numero di Fibonacci.\n");
		} else {
			System.out.printf("4 non è il secondo numero di Fibonacci.\n");
		}
		//
		if (testException.isNthFibonacci(47, Integer.MAX_VALUE)) {
			System.out.printf("%,d è il 47esimo numero di Fibonacci.\n", Integer.MAX_VALUE);
		} else {
			System.out.printf("%,d non è il 47esimo numero di Fibonacci.\n", Integer.MAX_VALUE);
		}
	}
}
