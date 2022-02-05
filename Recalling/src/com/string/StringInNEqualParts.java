package com.string;

public class StringInNEqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbbcccddd";
		nString(s, 3);
	}

	public static void nString(String input, int n) {
		if (input.length() % n != 0) {
			System.out.println("Given string can't divide");
		} 
		else {
			int part = input.length() / n;
			String[] result = new String[input.length() / part];
			int temp = 0;
			for (int i = 0; i < input.length(); i = i + part) {
				result[temp] = input.substring(i, i + part);
				temp++;
			}
			for (String s : result) {
				System.out.println(s);
			}
		}
	}
}
