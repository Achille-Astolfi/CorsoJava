package com.example.aprea.exception;

public class TestException {
	// per capire come funzionano le eccezioni ho bisogno di un metodo che solleva l'eccezione e di un metodo che ola gestisce
	// inizio ad usare metodi NON static (ovvero metodi dell'oggetto) che dovranno essere richiamati sull'oggetto e non sulla classe
	private int[] createArray(int length) {
		// se il valore del parametro è negativo oppure maggiore di 47, allora sollevo un'eccezione
		if (length < 0 || length > 47) {
			// per sollevare un'eccezione si usa throw
			// l'eccezione in java è un oggetto (di una classe), ergo devo usare new
			throw new IllegalArgumentException(); // tipo di eccezione che ha senso usare in questo caso
		}
		// altrimenti restituisco l'array
		// TODO: popolare l'array coi numeri di Fibonacci
		return new int[length]; // creo l'arrat col new
	}
	
	public boolean isNthFibonacci(int n, int numberToCheck) {
		// prima di gestire l'eccezione provo a scrivere quello che vorrei ottenere
		// invoco il metodo createArray per farmi dare i primi n+1 numeri di Fibonacci e poi controllo se l'elemento con indice n è uguale al secondo parametro
		
		int[] fibos;
		try {
			fibos = this.createArray(n+1);
		} catch (IllegalArgumentException e) {
			// il metodo printStackTrace va evitato, esistono altri modi per evidenziare lo stack di un'eccezione
			// e.printStackTrace();
			// la nostra soluzione: se viene sollevata un'eccezione significa che il risultato è sicuramente false
			return false;
		}
		
		// il this serve per poter lanciare il metodo createArray, che è un metodo dell'oggetto. il this si riferisce all'oggetto corrente
		
		// prima scuola di pensiero: retrun secco dell'espressione
		return fibos[n] == numberToCheck;
		// seconda scuola di pensiero: if con l'espressione e return true; else return false
//		if (fibos[n] == numberToCheck) {
//			return true;
//		} else {
//			return false;
//		}
	}
}
//per gestire le eccezioni della class IllegalArgumentAxception la costruzione si chiama try-catch
//
// try {
// 	istruzione o istruzioni da controllare
// } catch (IllegalArgumentException iae) {
// 	istruzione o istruzioni che devono "recuperare la situzione" (reagire all'eccezione)
// 	due alternative principali:
// 		1) return di qualcosa
// 		2) inizializzo eventiali variabili in modo alternativo rispetto a ciò che ha sollevato l'eccezione
// }