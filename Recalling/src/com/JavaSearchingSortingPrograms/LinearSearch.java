package com.JavaSearchingSortingPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 5, 6, 2 };
		int key = 1;
		lSearch(a, key);
	}

	public static void lSearch(int[] a, int key) {
		int fIndex = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				fIndex = i;
				break;
			}
		}
		if (fIndex == -1) {
			System.out.println("Sorry element is not found");
		} else {
			System.out.println("Serached element found at index no: " + fIndex);
		}
	}

}
