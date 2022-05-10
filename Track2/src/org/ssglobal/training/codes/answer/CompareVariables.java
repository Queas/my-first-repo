package org.ssglobal.training.codes.answer;

public class CompareVariables {
	
	public void comparePrimitive() {
		int x1 = 10;
		int x2 = 20;
		System.out.println(x1 == x2);
		
		
	}
	
	public void compareRefVar() {
		StringBuilder sb1 = new StringBuilder("Manila");
		StringBuilder sb2 = new StringBuilder("Manila");
		System.out.println(sb1 == sb2);
		
	}
}
