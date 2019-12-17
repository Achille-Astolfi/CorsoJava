package com.example.santinato.exception;

public class MainTestException {
	public static void main(String[] args) {
		// creo un oggetto di nome testException della classe tipo TestException
		
		TestException testexception = new TestException();
		
		if (testexception.isNthFibonacci(0, 0)) {
			System.out.println("0 è lo 0-esimo numero di fibonacci");
		} else {
			System.out.println("0 non è lo 0-esimo numero di fibonacci");
		}
		
		// faccio un altro test -> N.B = il copia-e-incolla non è il benvenuto
		
		if (testexception.isNthFibonacci(2, 4)) {
			System.out.println("4 è il secondo numero di fibonacci");
		} else {
			System.out.println("4 non è il secondo numero di fibonacci");
		}
		
		// Ultimo Test ->
		
		if (testexception.isNthFibonacci(47, Integer.MAX_VALUE)) {
			System.out.println("%,d è il secondo numero di fibonacci" + Integer.MAX_VALUE);
		} else {
			System.out.println("%,d non è il secondo numero di fibonacci" + Integer.MAX_VALUE);
		}
	}
}
