package org.ssglobal.training.codes;

public class MyMatrices {

	public void addMatrices(int[][]... matrices) {

		for (int[][] matrix: matrices) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) { 
					// matrix[i].length for number of columns (based on the lecture). (SUKO NA AKO AHHAHA)