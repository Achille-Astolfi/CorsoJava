package com.example.patane.humansex;

public class Person {
	private String firstName;
	private String lastName;
	private HumanSex gender;
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
	
	public static void main(String[] args) {
		Person crespan= new Person();
		crespan.setFirstName("Emanuele");
		crespan.setLastName("Crespan");
		crespan.setGender(HumanSex.NOT_APPLICABLE);
		System.out.println(crespan.getFirstName() + " il " + crespan.getLastName() + "  " + crespan.getGender());
	}
}
