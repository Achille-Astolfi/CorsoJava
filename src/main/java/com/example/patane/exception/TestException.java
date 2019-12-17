package com.example.patane.exception;

public class TestException 
{
	
	private int[] createArray(int lenght) 
	{
		if (lenght <0 || lenght > 47) 
		{
			throw new IllegalArgumentException();
		}
		return new int[lenght];
	}
	public boolean isNthFibonacci(int n, int numberToCheck) 
	{
		int[] fibos;
		try {
			fibos= this.createArray(n + 1);
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			return false;
		}
		return fibos[n] == numberToCheck;
	}

}
