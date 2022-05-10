package org.ssglobal.training.codes.generics;

public class StatOps<N> {

	@SuppressWarnings("unchecked")
	public N sum(N[] data) throws NullPointerException, 
						ArrayIndexOutOfBoundsException, Exception {
		N sum = null;
		Number temp = 0;
		for (N lookup : data) {
			Number num = (Number) lookup;
			if(num instanceof Integer) {
				int intTemp = (Integer) temp.intValue();
				intTemp += (int) num;
				temp = intTemp;
			} else if (num instanceof Double) {
				double dblTemp = (Double) temp.doubleValue();
				dblTemp += (double) num;
				temp = dblTemp;
			} else if (num instanceof Float) {
				float fltTemp = (Float) temp.floatValue();
				fltTemp += (float) num;
				temp = fltTemp;
			}
		}
		sum = (N) temp;
		return sum;
	}
}
