package org.ssglobal.training.codes.answer;

public class TestFraction {

	public static void main(String[] args) {
		// add() method
		
		Fraction f1 = new Fraction();
		f1.numerator = 1;
		f1.denominator = 2;
		
		Fraction f2 = new Fraction();
		f2.numerator = 3;
		f2.denominator = 4;
		
		Fraction f3 = new Fraction();
		f3.numerator = 2;
		f3.denominator = 3;
		
		f1.add(f2).add(f3).toFractionString();
		
		f1.multiply(f2).multiply(f3).toFractionString();;
	}

}
