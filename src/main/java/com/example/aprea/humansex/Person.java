package com.example.aprea.humansex;

public class Person {
	// dichiaro una serie di campi, ogni campo è private tipo nome, dove tipo può essere qualunque tipo java, anche primitivo.
	// le enumeration sono tipi java, quindi...
	private String firstName;
	private String lastName;
	private HumanSex gender;
	// in questo modo gli oggetti di Person che creo avranno nome, cognome e sesso come campi

	// genero getter e setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public HumanSex getGender() {
		return gender;
	}

	public void setGender(HumanSex gender) {
		this.gender = gender;
	}
}
