package com.matrix;

public class LowerTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		lowerTringle(a);
	}

	public static void lowerTringle(int[][] m1) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = i + 1; j < m1[i].length; j++) {
				m1[i][j] = 0;
			}
		}
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
