package com.JavaSearchingSortingPrograms;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a= {1,4,2,6,3,2,1,5,3,9};
		iSort(a);
	}
	public static void iSort(int[] a) {
		System.out.println("Array Before Sorting");
		DisplayArray.display(a);
		for (int i=1;i<a.length-1;i++) {
			int key = a[i];
			int j=i-1;
			while(j>-1 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		System.out.println("Array after sorting");
		DisplayArray.display(a);
	}
}
