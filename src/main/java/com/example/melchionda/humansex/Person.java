package com.example.melchionda.humansex;

public class Person {
	// dichiaro una serie di campi
	// Ogni campo è private tipo nome
	// dove tipo può essere qualunque tipo Java, anche primitivo
	// Le enumeration sono tipi Java quindi...
	private String firstName;
	private String lastName;
	private HumanSex gender;
	private MaritalStatus maritalstatus;
	private int age;
	
	// generare getter e setter per farlo diventare un Javabean
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
	public MaritalStatus getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(MaritalStatus maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
