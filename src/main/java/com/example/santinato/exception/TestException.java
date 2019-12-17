package com.example.santinato.exception;

public class TestException {
	// per capire come funzionano le eccezioni, devo creare un metodo che sollevi l'eccezione e un metodo che la gestisca
	
	private int[] createArray(int lenght) {
		if (lenght < 0 || lenght > 47) {
			// per sollevare una eccezione si usa la parola chiave throw. 
			// In java l'eccezione è un oggetto di una classe quindi per crearne una nuova devo usare la parola chiave new
			
			throw new IllegalArgumentException();
		}
		
		//TODO: Popolare l'array con i numeri di fibonacci
		// Se non solleva l'eccezione restituisce un array di dimensione lenght
		return new int[lenght];
	}
	
	public boolean isNthFibonacci(int n, int numberToChech) {
		// Prima di gestire l'eccezione provo a scrivere quello che vorrei ottenere
		// Invoco il metodo createArray per farmi restituire i primi n + 1 numeri di fibonacci e poi controllo se l'elemento con indice n è uguale al secondo paramentro
		
		int[] fibonacci;
		
		try {
			fibonacci = this.createArray(n + 1);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			
			// Questa soluzione non è efficace, esistono modi migliori per gestire l'eccezione
			//e.printStackTrace();
			
			// La nostra soluzione  se si solleva l'eccezione significa che il risultato  è sicuramente false
			return false;
		}
		
		
		
		// Prima scuola di pensierio: faccio un return secco di fibonacci
		//return fibonacci[n] == numberToChech;
		
		// Seconda scuola: utilizzo un if con espressione return true; esle return false;
		
		if (fibonacci[n] == numberToChech) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
