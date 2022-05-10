package org.ssglobal.training.codes;

public class Statistics {
	
	public void compute(int... data) {
		System.out.format("\n");
		System.out.format("\n");
		System.out.format("mean: %f\n", mean(data));
		System.out.format("geometric mean: %f\n", geometricMean(data));
		System.out.format("variance: %f\n", variance(data));
		showMinMax(data);
	}
	
	public double mean(int[] data) {
		
		int sum = 0;
		
		for (int bell: data) {
			sum += bell;
		}
		
		return (double) sum / 2;
	}
	
	public double geometricMean(int[] data) {
		
		int product = 1;
		
		for (int bell: data) {
			product += bell;
		}

		return Math.sqrt(product);
	}
	
	public double variance(int[] data) {
		
		int sum = 0;
		double diff = 0;
		
		for (int bell: data) {
			sum += bell;
		}
		
		double avg = (double) sum / data.length;

		for (int bell: data) {
			diff += (bell - avg) * (bell - avg);
		}
		
		return diff / data.length;
	}
	
	public void showMinMax(int[] data) {
		
		int min = data[0];
		int max = data[0];
		
		for (int bell: data) {
			if (bell < min) {
				min = bell;
			}
			if (bell > max) {
				max = bell;
			}
		}

		System.out.format("min: %d\n", min);
		System.out.format("max: %d", max);
		
	}
	
}