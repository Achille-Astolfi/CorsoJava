package com.example.santinato.humansex;

public class Person {
	// vado a dichiarare una serie di campi, dove ogni campo è privatre tipo nome
	// ogni tipo può essere qualunque tipo Java, anche di tipo primitivo
	// le enumeration sono tipi java quindi ottengo che...
	
	private String firstName;
	private String lastName;
	private HumanSex gender;
	private MaritialStatus maritialStatus;
	
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
	public MaritialStatus getMaritialStatus() {
		return maritialStatus;
	}
	public void setMaritialStatus(MaritialStatus maritialStatus) {
		this.maritialStatus = maritialStatus;
	}
	
	
}
