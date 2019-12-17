package com.example.astolfi.exception;

public class TestException {
	// per capire come funzionano le eccezioni ho bisogno di un metodo
	// che solleva l'eccezione e di un metodo che la gestisce
	private int[] createArray(int length) {
		// se il valore del parametro è negativo oppure maggiore di 47 allora
		// sollevo un'eccezione
		if (length < 0 || length > 47) {
			// per sollevare un'eccezione si usa la parola chiave throw
			// l'eccezione in Java è un oggetto e quindi devo usare la parola chiave new
			throw new IllegalArgumentException();
		}
		// altrimenti restituisco l'array
		// TODO: popolare l'array con i numeri di Fibonacci
		return new int[length];
	}
	
	public boolean isNthFibonacci(int n, int numberToCheck) {
		// prima di gestire l'eccezione provo a scrivere quello che vorrei ottenere
		
		// invoco il metodo createArray per farmi dare i primi n + 1 numeri di Fibonacci
		// e poi controllo se l'elemento con indice n è uguale al secondo parametro
		int[] fibos;
		try {
			fibos = this.createArray(n + 1);
		} catch (IllegalArgumentException e) {
			// il metodo printStackTrace va evitato
			// esistono altri modi per evidenziare lo stack di una eccezione
//			e.printStackTrace();
			// la nostra soluzione: se viene sollevata un'eccezione significa
			// che il risultato è sicuramente false
			return false;
		}
		
		// prima scuola di pensiero: return secco dell'espressione
		return fibos[n] == numberToCheck;
		// seconda scuola di pensiero: if con l'espressione e return true; else return false;
//		if (fibos[n] == numberToCheck) {
//			return true;
//		} else {
//			return false;
//		}
	}
}
