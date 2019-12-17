package com.example.distefano.exception;

public class TestException {
	
	private static int[] createIntArray(int length) {
		if (length < 0 || length > 47)
			throw new IllegalArgumentException();
		//TODO popolare l'array con i membri di fibonacci
		return new int[length];
	}
	
	public static boolean isNthFibonacci(int n, int numberToCheck) {
		int[] fibos;
		try {
			fibos = createIntArray(n + 1);
		} catch (Exception e) {
			return false;
		}
		return fibos[n] == numberToCheck;
	}
}
