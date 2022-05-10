package org.ssglobal.training.codes;

public class WaterPipe {
	
	public static final float π = 3.141617F;
	
	public double computeVolume(final double d, final double v) {
		
		double radius = d / 2;
		double area = π * (radius * radius);
		double volume = area * v;

		System.out.format("diameter: %f\n", d);
		System.out.format("area: %f\n", area);
		System.out.format("volume: %f\n", volume);
		System.out.println("\n");
		return 0.0;

	}
}