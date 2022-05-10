package org.ssglobal.training.codes.answer;

public class TestPassVariables {

	public static void main(String[] args) {
		PassVariables cv = new PassVariables();
		
		
		// primitive var
		int testX = 10;
		System.out.format("This is the original num: %d. \n", testX);
		cv.passPrimitive(testX);
		System.out.format("The new num is %d. \n", testX);
	
		
		// sb[12356644ABCD] ==> 1235644ABCD("Manila")
		// reference var
		StringBuilder testSb = new StringBuilder("Manila");
		System.out.format("This is the original sb is %s. \n", testSb);
		cv.passRefVar(testSb);
		System.out.format("This is the new sb is %s. \n", testSb);


		String testStr = new String("Manila");
		System.out.format("This is the original testStr is %s. \n", testStr);
		cv.passStrVal(testStr);
		System.out.format("This is the new testStr is %s. \n", testStr);
		
		
	}

}
