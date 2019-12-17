package com.example.melchionda.exeption;

public class MainException {
	public static void main(String[] args) {
		//creo un oggetto TestException
		TestException testException = new TestException();
		// testo quello che devo testare
		if (testException.isNthFibonacci(0, 0)) {
			System.out.printf("0 è lo 0-esimo numero di Fibonacci.\n");
		} else {
			System.out.printf("0 non è lo 0-esimo numero di Fibonacci.\n");
		}
		
		// faccio un altro test
		if (testException.isNthFibonacci(2, 4)) {
			System.out.printf("4 è il secondo numero di Fibonacci.\n");
		} else {
			System.out.printf("4 non è il secondo numero di Fibonacci.\n");
		}
		// ultimo test (per sollevare eccezione)
		// il 47esimo valore è il più grande valore rappresentabile in Java?
		// il 47esimo numero di Fibonacci esiste ma non ci sta in un int
		if (testException.isNthFibonacci(47, Integer.MAX_VALUE)) {
			System.out.printf("%,d è il 47esimo numero di Fibonacci.\n", Integer.MAX_VALUE);
		} else {
			System.out.printf("%,d non è il 47esimo numero di Fibonacci.\n", Integer.MAX_VALUE);
		}
	}
}
