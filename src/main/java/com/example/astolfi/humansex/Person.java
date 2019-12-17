package com.example.astolfi.humansex;

public class Person {
	// dichiaro una serie di campi
	// ogni campo è private tipo nome;
	// dove tipo può essere qualunque tipo Java, anche primitivo
	// Le enumeration sono tipi Java quindi...
	private String firstName;
	private String lastName;
	private HumanSex gender;
	private MaritalStatus maritalStatus;
	private int age;

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

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
