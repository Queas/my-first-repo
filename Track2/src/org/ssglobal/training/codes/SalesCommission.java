package org.ssglobal.training.codes;

public class SalesCommission {

	public void monetize(int... sales) {
		
		double commission = 0;
		double sumSales = 0;
		
		System.out.print("Sales: ");
		for (int i = 0; i < sales.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(sales[i]);
			sumSales += sales[i];
		}
		
		System.out.println();
		if (sumSales >= 1000) {
			commission = sumSales * 0.08;
		}
		
		System.out.format("The commission is: %f\n", commission);
		
	}
}