package com.example.git;

public class RobertoPatane {
	//sto facendo una modifica sostanzile
	
	private RobertoPatane instance;
	
	private RobertoPatane() {}
	
	public RobertoPatane getInstance() {
		if(instance==null)
			instance=new RobertoPatane();
		return instance;
	}
}
