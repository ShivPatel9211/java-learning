package com.JavaSearchingSortingPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 4, 2, 6, 3, 2, 1, 5, 3, 9 };
		bSort(a);
	}

	public static void bSort(int[] a) {
		System.out.println("Array Before Sorting");
		DisplayArray.display(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				int temp;
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Array after sorting");
		DisplayArray.display(a);
	}
}
