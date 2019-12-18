package com.example.aprea.humansex;

public class PersonMain {
	public static void main(String[] args) {
		// tutte String perchè potrei leggerle con un Scanner su System.in o su una Path
		String first = "Vincenzo";
		String last = "Aprea";
		String sex = "MALE";
		String marital = "NOT_MARRIED";
		String age = "51";
		Person vincenzo = new Person();
		vincenzo.setFirstName(first);
		vincenzo.setLastName(last);
		// per i valori non String uso i metodi opportuni (esempio: valueOf, parseInt, parseDouble)
		vincenzo.setGender(HumanSex.valueOf(sex));
		vincenzo.setMaritalStatus(MaritalStatus.valueOf(marital));
		vincenzo.setAge(Integer.parseInt(age));
	}
}
