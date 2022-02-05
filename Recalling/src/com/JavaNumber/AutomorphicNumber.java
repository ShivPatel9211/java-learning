package com.JavaNumber;

public class AutomorphicNumber {
	public static void main(String[] args) {
		if(Automorphic(25)) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not Automorphic Number");
		}
	}
	public static Boolean Automorphic(int input) {
		int sq;
		sq=input*input;
		while(input>0) {
			if(sq%10 != input%10) {
				return false;
			}
			input=input/10;
			sq=sq/10;
		}
		return true;
	}
}