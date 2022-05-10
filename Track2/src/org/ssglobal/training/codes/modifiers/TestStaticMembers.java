package org.ssglobal.training.codes.modifiers;

public class TestStaticMembers {

	public static void main(String[] args) {
		
		StaticMembers sm1 = new StaticMembers();
		StaticMembers sm2 = new StaticMembers();
		StaticMembers sm3 = new StaticMembers();

		// instance variables
		sm1.e = 3.17;
		System.out.println(sm1.e);
		//sm2.e = 4.17;
		System.out.println(sm2.e);
		//sm3.e = 5.17;
		System.out.println(sm3.e);

		sm1.pie = 4.1416;
		System.out.println(sm1.pie);
		System.out.println(sm2.pie);
		System.out.println(sm3.pie);
		
		
		// Instance methods
		sm1.isZero(0);
		sm2.isZero(100);
		sm3.isZero(-1);
		
		sm1.even(-10);
		sm2.even(100);
		sm3.even(5);
	}
}
