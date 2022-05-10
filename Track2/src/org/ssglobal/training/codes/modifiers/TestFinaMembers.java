package org.ssglobal.training.codes.modifiers;

public class TestFinaMembers extends FinalMembers {

	public static void main(String... args) {
		
		FinalMembers fm = new FinalMembers();
		System.out.println(fm.PIE);
		
		fm.accessWithoutOverride();
		fm.accessPoint();
	}
	
	public void accessPoint() {
		accessWithoutOverride();
	}
}
