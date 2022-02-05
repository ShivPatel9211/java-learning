package com.JavaNumber;

public class FascinatingNumber {
	public static void main(String[] args) {
		if(check(327)) {
			System.out.println("Fascinating Number");
		}
		else {
			System.out.println("Not fascinating Number");
		}
	}
	public static boolean check(int num) {
		int num1=num*2;
		int num2=num*3;
		String concat=num+""+num1+""+num2;
//		System.out.println(concat);
		for(char i='1';i<='9';i++) {
			int count=0;
			for(int j=0;j<concat.length();j++) {
				char ch=concat.charAt(j);
				if (ch==i) {
//					System.out.println("found");
					count++;
				}
			}
			if(count>1||count==0) {
				return false;
			}
		}
		return true;
	}
}
