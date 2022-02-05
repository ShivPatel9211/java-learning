package com.array;

public class LeftRightRotateTheElementsOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = 4;
		rotateLeft(arr, n);
//		rotateRight(arr, n);
	}

	public static void rotateLeft(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int element;
			int j;
			element = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = element;
		}
		System.out.println("Rotate left");
		display(arr);
	}

	public static void rotateRight(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int element = arr[arr.length - 1];
			int j;
			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = element;
		}
		System.out.println("Rotate right");
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i : arr) {
			System.out.println(i + " ");
		}
	}
}
