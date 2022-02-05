package com.pattern.printing;

public class InvertedTriangle {
	public static void main(String[] args) {
		iTringle(4);
	}

	public static void iTringle(int n) {
		for (int i = n; i >= 1; i--) {
			int temp = i;
			for (int j = 1; j <= (2 * i - 1); j++) {
				while (temp < n) {
					System.out.print("  ");
					temp++;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
