package com.example.crespan.exception;

@SuppressWarnings("unused")
public class Exept {
	private int[] createArray(int l) {
		if(l<0 || l>46)
			throw new IllegalArgumentException();
		return new int[l];
	}
	
	public void createFibo(int[] a) {
		if(a==null || a.length<3)
			throw new IllegalArgumentException();
		
		a[0]=1;
		a[1]=1;
		for (int i = 2; i < a.length; i++)
			a[i]=a[i-1]+a[i-2];
	}
	
	public static long fibo(long n) {
		if(n<3)
			return 1;
		long f1=1,f2=1;
		long f=2;
		for (long i = 3; i <= n; i++) {
			f=f1+f2;
			f1=f2;
			f2=f;
		}
		return f;
	}
	
	public static boolean isFibo(int n, int nn) {
		return fibo(nn)==n;
	}
	
	public static void main(String[] args) {
		Exept ex= new Exept();
		int[] a=ex.createArray(6);
		ex.createFibo(a);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		System.out.println(isFibo(8, 6));
	}
}
