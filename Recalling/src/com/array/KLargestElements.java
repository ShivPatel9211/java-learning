package com.array;

import java.util.Arrays;

public class KLargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 12, 5, 787, 1, 23 };
		kLargest(a, 3);
	}

	public static void kLargest(int[] a, int k) {
		Arrays.sort(a);
		for (int i = 0; i < k; i++) {
			System.out.print(a[a.length - 1 - i] + " ");
		}
	}
}
