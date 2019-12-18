package com.example.astolfi.humansex;

public class PersonMain {
	public static void main(String[] args) {
		// tutte String perché per esempio potrei leggerle con uno Scanner
		// su System.in o su una Path
		String first = "Achille";
		String last = "Astolfi";
		String sex = "MALE";
		String marital = "MARRIED";
		String age = "51";
		
		// quando creo l'oggetto Person posso fare il set di ogni valore
		Person achille = new Person();
		achille.setFirstName(first);
		achille.setLastName(last);
		// per i valori non String uso i vari metodi che ho a disposizione
		// per le enumeration uso valueOf
		achille.setGender(HumanSex.valueOf(sex));
		achille.setMaritalStatus(MaritalStatus.valueOf(marital));
		// per i valori numerici uso parseXxx
		achille.setAge(Integer.parseInt(age));
	}
}
