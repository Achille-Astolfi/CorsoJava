package com.example.astolfi.humansex;

// si consiglia sempre di fare l'import static delle costanti di una enumeration
import static com.example.astolfi.humansex.HumanSex.*;

public class HumanSexMain {
	public static void main(String[] args) {
		// cosa abbiamo "aggratis" da una enumeration
		// conversione in String: esattamente uguale al nome della costante
		System.out.printf("La costante MALE è convertita in String: %s\n", MALE);
		// qual è la posizione (0-based) della costante all'interno delle dichiarazioni?
		// uso il metodo ordinal()
		System.out.printf("La costante FEMALE è in posizione: %d\n", FEMALE.ordinal());
		// ho un metodo del tipo che si chiama values() e mi restituisce
		// un array su cui (per esempio) posso fare un for-each:
		for (HumanSex hs : HumanSex.values()) {
			System.out.printf("%s\n", hs);
		}
		// ho anche un metodo del tipo valueOf che ha un parametro String che converte
		// "al contrario" dalla String mi ricostruisce l'oggetto 
		HumanSex notApplicable = HumanSex.valueOf("NOT_APPLICABLE");
		// verifica:
		System.out.printf("Ho ottenuto l'oggetto: %s\n", notApplicable);
	}
}
