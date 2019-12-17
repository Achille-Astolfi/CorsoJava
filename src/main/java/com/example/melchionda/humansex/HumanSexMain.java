package com.example.melchionda.humansex;

// si consiglia sempre l'import static delle costanti di enumeration
import static com.example.melchionda.humansex.HumanSex.*;

public class HumanSexMain {
	public static void main(String[] args) {
		// conversione in String: esattamente uguale al nome della costante
		System.out.printf("La costante MALE è convertita in String: %s\n", MALE);
		// qual è la posizione (0-based) della costante all'interno delle dichiarazioni?
		// uso il metodo ordinal()
		System.out.printf("La costante FEMALE è in posizione: %d\n", FEMALE.ordinal());
		// values() è il metodo del tipo (HumanSex in questo caso) che mi restituisce
		// un array su cui posso fare un for-each:
		for (HumanSex hs : HumanSex.values()) {   // hs è utilizzata per iterare sull'array
			System.out.printf("%s\n", hs);
		}
		// ho anche un metodo del tipo valueOf che ha un parametro String che converte
		// "al contrario" dalla String mi ricostruisce l'oggetto
		// cerca tra i 4 oggetti di HumanSex l'oggetto NOT_APPLICABLE; appena lo trova lo restituisce
		HumanSex notApplicable = HumanSex.valueOf("NOT_APPLICABLE");
		// verifica: 
		System.out.printf("Ho ottenuto l'oggetto: %s\n", notApplicable);
	}
}
