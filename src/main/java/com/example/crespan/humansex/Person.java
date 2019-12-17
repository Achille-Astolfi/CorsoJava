package com.example.crespan.humansex;

public class Person {
	private String name;
	private String surname;
	private HumanSex sex;
	private CivilState civilsState;
	
	public Person() {}
	
	public Person(String n, String s, HumanSex sx, CivilState cs){
		name=n;
		surname=s;
		sex=sx;
		civilsState=cs;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getSurname() { return surname; }
	public void setSurname(String surname) { this.surname = surname; }
	public HumanSex getSex() { return sex; }
	public void setSex(HumanSex sex) { this.sex = sex; }
	public CivilState getCivilsState() { return civilsState; }
	public void setCivilsState(CivilState civilsState) { this.civilsState = civilsState; }
	
	public String toString() {
		return "Name: "+name+"\nCognome: "+surname+"\nSesso: "+sex+"\nStato civile: "+civilsState;
	}
}
