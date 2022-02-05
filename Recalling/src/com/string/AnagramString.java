package com.string;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "cbca";
		Anagram(s1, s2);
	}

	public static void Anagram(String input1, String input2) {
		char[] s1 = input1.toLowerCase().toCharArray();
		char[] s2 = input2.toLowerCase().toCharArray();
		int temp = 0;
		Arrays.sort(s1);
		Arrays.sort(s2);
		if (s1.length != s2.length) {
			System.out.println("Not Anagram String");
		} 
		else {
			for (int i = 0; i < s1.length; i++) {
				if (s1[i] != s2[i]) {
					temp = 1;
					break;
				}
			}
			if (temp != 0) {
				System.out.println("Not Anagram String");
			}
			else {
				System.out.println("Not Anagram String");
			}
		}
	}
}
