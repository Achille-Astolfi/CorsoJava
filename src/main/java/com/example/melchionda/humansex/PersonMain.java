package com.example.melchionda.humansex;

public class PersonMain {
	public static void main(String[] args) {
		// tutte string perchè potrei leggerle con uno scanner
		// su System.in o su una Path
		String first ="Roberta";
		String last = "Melchionda";
		String sex = "FEMALE";
		String marital = "NOT_MARRIED";
		String age = "24";
		
		// quando crep l'oggetto Person posso fare il set di ogni valore
		Person roberta = new Person();
		roberta.setFirstName(first);
		roberta.setLastName(last);
		//per i valori non string uso i vari metodi a disposizione
		// per le enumeration uso valueOf
		roberta.setGender(HumanSex.valueOf(sex));
		
		roberta.setMaritalstatus(MaritalStatus.valueOf(marital));
		// per i valori numerici uso parseXxx
		roberta.setAge(Integer.parseInt(age));
	}
}
