package com.example.aprea.humansex;

// si consiglia di fare sempre l'import static delle costanti di una enumeration
import static com.example.aprea.humansex.HumanSex.*;

public class HumanSexMain {
	public static void main(String[] args) {
		// cosa abbiamo "aggratis" da una enumeration
		// conversione in String: esattamente uguale al nome della costante
		System.out.printf("La costante MALE è convertita in String: %s\n", MALE);
		// qual è la posizione (0-based) della costante all'interno delle dichiarazioeni?
		System.out.printf("La costante FEMALE è in posizione: %d\n", FEMALE.ordinal()); // il metodo dell'oggetto "ordinal" fornisce il numero della posizione
		// della variabile all'interno della enumeration (partendo da zero)
		// ho un metodo del tipo (della enumeration) che si chiama values() e mi restituisce un array di tutti i campi, sul quale (per esempio) posso fare un for-each
		for (HumanSex hs : HumanSex.values()) {
			System.out.printf("%s\n", hs);
		}
		// ho anche un metodo del tipo valueOf che ha un parametro String che converte "al contrario" dalla String mi ricostruisce l'oggetto
		HumanSex notApplicable = HumanSex.valueOf("NOT_APPLICABLE");
		// verifica
		System.out.printf("Ho ottenuto l'oggetto: %s\n", notApplicable);
		
		
		
	}
}
