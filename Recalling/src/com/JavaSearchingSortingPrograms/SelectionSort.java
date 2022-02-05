package com.JavaSearchingSortingPrograms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 4, 2, 6, 3, 2, 1, 5, 3, 9 };
		sSort(a);
	}

	public static void sSort(int[] a) {
		System.out.println("Array Before Sorting");
		DisplayArray.display(a);
		for (int i = 0; i < a.length - 1; i++) {
			int index = i;
			;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index]) {
					index = j;
				}
			}
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
		}
		System.out.println("Array after sorting");
		DisplayArray.display(a);
	}
}
