package com.pattern.printing;

public class SprialMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] a = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
		int[][] a = new int[4][4];
		sperial(a);

	}

	public static void sperial(int[][] a) {
		int lRow = a.length;
		int lCol = a[0].length;
		int dir = 0;
		int top = 0;
		int left = 0;
		int right = lCol - 1;
		int down = lRow - 1;
		int value = 1;
		while (top <= down && left <= right) {
			if (dir == 0) {
				for (int i = top; i <= right; i++) {
//					System.out.print(a[top][i]+ " ");
					a[top][i] = value;
					value++;
				}
				top++;
			} else if (dir == 1) {
				for (int i = top; i <= down; i++) {
//					System.out.print(a[i][right]+ " ");
					a[i][right] = value;
					value++;
				}
				right--;
			} else if (dir == 2) {
				for (int i = right; i >= left; i--) {
//					System.out.print(a[down][i]+ " ");
					a[down][i] = value;
					value++;
				}
				down--;
			} else if (dir == 3) {
				for (int i = down; i >= top; i--) {
//					System.out.print(a[i][left]+ " ");
					a[i][left] = value;
					value++;
				}
				left++;
			}
			dir = (dir + 1) % 4;
		}
		for (int k = 0; k < lRow; k++) {
			for (int l = 0; l < lCol; l++) {
				System.out.print(a[k][l] + " ");
			}
			System.out.println();
		}

//		for(int[] i: a) {
//			for(int j:i) {
//				System.out.println(j);
//			}
//		}
	}
}
