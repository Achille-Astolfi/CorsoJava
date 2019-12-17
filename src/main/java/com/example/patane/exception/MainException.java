package com.example.patane.exception;

public class MainException {
	public static void main(String[] args) {
		TestException testExcepion= new TestException();
		if (testExcepion.isNthFibonacci(0, 0)) {
			System.out.println("0 è lo 0-simo numero di Fibonacci");
		} else {
			System.out.println("0 non è lo 0-esimo numero di Fibonacci");
		}
		if (testExcepion.isNthFibonacci(2, 4)) {
			System.out.println("4 è il secondo numero di Fibonacci");
		} else {
			System.out.println("4 non è il secondo numero di Fibonacci");
		}
		if (testExcepion.isNthFibonacci(48, Integer.MAX_VALUE)) {
			System.out.println(Integer.MAX_VALUE + " è lo 47-simo numero di Fibonacci");
		} else {
			System.out.println(Integer.MAX_VALUE + " non è il 47-esimo numero di Fibonacci");
		}
	}
}
