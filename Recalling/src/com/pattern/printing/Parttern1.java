package com.pattern.printing;

public class Parttern1 {
	public static void main(String[] args) {
//		P1();
		P2();
	}

	public static void P1() {
		int line=5;
		for(int i=1;i<=line;i++) {
			for(int j=line;j>0;j--) {
				if(j==i) {
					System.out.print("*");
				}
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void P2() {
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}
}
