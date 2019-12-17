package com.example.melchionda.exeption;

//la prima parte solleva un metodo; mentre la seconda non la gestisce

// se non solleva l'eccezione restituisce il valore
public class TestException {
	// per capire come funzionano le eccezioni ho bisogno di un metodo
	// che solleva l'eccezione  e di un metodo che la gestisce
	private int [] createArray(int length) {
		// se il valore del parametro è negativo oppure maggiore di 47 
		// allora sollevo un'eccezione
		if (length < 0 || length > 47) {
			// per sollevare un'eccezione si usa la parola chiave throw
			// l'eccezione in Java è un oggetto e quindi devo usare la parola chiave new
			throw new IllegalArgumentException(); 
		}
		//altrimento restituisco l'array
		//TODO: popolare l'array con i numeri di Fibonacci
		return new int[length];
	}
	// restituisce true or false quando inserisco la posizione e il numero corrispondente
	public boolean isNthFibonacci(int n, int numberToCheck) {
		// prima di gestire l'eccezione provo a scrivere quello che vorrei ottenere
		// invoco il metodo createArray per farmi dare i primi n + 1 numeri di Fibonacci
		// n+1 perchè voglio l'nesimo numero
		//e poi controllo se l'elemento con indice n è uguale al secondo parametro
		int[] fibos;
		try {
			fibos = this.createArray(n + 1); // n+1 creare gli indici da 0 a n
		} catch (IllegalArgumentException e) {
			// e.printStackTrace();  // genera la scritta in rosso; meglio evitarlo 
			// esistono altri modi per evidenziare lo stack di una eccezione
			// la nostra soluzione se viene sollevata un'eccezione significa che 
			// il risultato è sicuramente false
			return false;  // fibos della parte successiva non è più sottolineato
			// senza il return sarebbe stato necessario inizializzare fibos
		}  
		
		// uno: return secco eccezione
		return fibos[n] == numberToCheck;
		
		// due: if con espressione e return true; else return false;
//		if (fibos[n] == numberToCheck) {
//			return true;
//		} else {
//			return false;
//		}
		
	}
}
