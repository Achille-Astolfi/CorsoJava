package com.example.patane.humansex;
import static com.example.patane.humansex.HumanSex.*;
public class HumanSexName 
{
	
	public static void main(String[] args) 
	{
		System.out.println("La costante MALE è convertita in String: " + MALE);
		
		System.out.println("La costante Female è in posizione: " + FEMALE.ordinal());
		
		for (HumanSex hs : HumanSex.values()) 
		{
			System.out.println(hs);
		}
		
		HumanSex notApplicable= HumanSex.valueOf("NOT_APPLICABLE");
		System.out.println("ho ottenuto l'oggetto: " + notApplicable);
	}
	
}
