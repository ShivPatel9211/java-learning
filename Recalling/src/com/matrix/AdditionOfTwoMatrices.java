package com.matrix;

public class AdditionOfTwoMatrices {
	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		addition(a, b);
	}

	public static void addition(int[][] m1, int[][] m2) {
		int[][] result = new int[m1.length][m2.length];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
