package com.example.distefano.exception;

public class MainException {

	public static void main(String[] args) {
		if (TestException.isNthFibonacci(47, 0)) {
			System.out.println("0 è lo 0-simo numero di Fibonacci.");
			return;
		}
		System.out.println("0 non è lo 0-simo numero di Fibonacci");
	}

}
