package org.ssglobal.training.codes.modifiers;

public class ClassMembers {
	
	// class variables
	public static long id = 1;
	double salary = 100.5;
	protected int key = 68638453;
	private char letter = 'v';
	
	
	// instance variables
	public long age = 10;
	
	// methods 
	public void showData() {
		id = 2L;
		salary = 5000.5;
		key = 855885;
		letter ='h';
	}
	
	void printData() {
		
	}
	
	protected void authenticate() {
		
	}
	
	public void encryptData() {
		
	}
	
	public void reference() {
		showData();
		printData();
		authenticate();
	}

}
