package com.matrix;

public class MultiplyTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		multiply(a, b);
	}

	public static void multiply(int[][] m1, int[][] m2) {
		if (m1.length != m2[0].length) {
			System.out.println("Matrices connot be multiply");
		} else {
			int[][] result = new int[m1.length][m2.length];
			for (int i = 0; i < m1.length; i++) { // 0
				for (int j = 0; j < m2.length; j++) {// 0
					int temp = 0;
					for (int k = 0; k < m2.length; k++) {// 0
						temp = temp + m1[i][k] * m2[k][j];
					}
					result[i][j] = temp;
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
}
