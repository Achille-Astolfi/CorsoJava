package com.example.santinato.humansex;

import static com.example.santinato.humansex.HumanSex.*;

public class HumanSexMain {
	public static void main(String[] args) {
		 // se convertiamo un metodo della enumeration in string, il risultato sarà uguale al nome della costante dichiarata
		
		System.out.println("La stringa MALE è convertita in String: " + MALE);
		
		// Qual'è la posizione (0-based) della costante all'interno delle dichiarazioni?
		
		System.out.println("La costante FEMALE è in posizione: " + FEMALE.ordinal());
		
		// Ho un metodo del tipo che si chiama values() e mi restituisce qualcosa su cui posso fare un for-each
		
		for (HumanSex hs : HumanSex.values()) {
			System.out.println(hs);
		}
		
		// Ho anche un metodo del tipo valuesOf() che ha un parametro String che converte al "contrario" ricostruendo l'oggetto partendo dalla String passata
		
		HumanSex notApplicable = HumanSex.valueOf("NOT_APPLICABLE");
		System.out.println("Ho ottenuto l'oggetto: " + notApplicable);
	}
}
