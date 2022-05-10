package org.ssglobal.training.codes;

public class TestStatistics {

	public static void main(String[] args) {

		Statistics stats = new Statistics();
		stats.compute(1020);
		stats.compute(2040);
		stats.compute(3050);
		stats.compute(4060);
		stats.compute(5070);
	}

}