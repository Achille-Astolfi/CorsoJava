package com.example.git;

public class EmanueleCrespan {
	public int ciao=9;
	//basta modificare la mia classe
	
	public int alleluiaJesu;
	public int babbo;

	private EmanueleCrespan instance;
	private EmanueleCrespan() {}
	
	public EmanueleCrespan getInstance() {
		if(instance==null)
			instance=new EmanueleCrespan();
		return instance;
	}
}
