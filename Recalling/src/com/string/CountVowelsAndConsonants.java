package com.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "apple is fruit";
		count(s);
	}

	public static void count(String input) {
		input = input.toLowerCase();
		input=input.replace(" ", "");
		int consonantCount = 0;
		int vowelCount = 0;
		Set<String> vowel = new HashSet<>();
		vowel.addAll(Arrays.asList("a", "e", "i", "o", "u"));
		for (int i = 0; i < input.length(); i++) {
			if (vowel.contains(Character.toString(input.charAt(i)))) {
				vowelCount++;
			} else {
				consonantCount++;
			}
		}
		System.out.println("Total no of vowels are: " + vowelCount);
		System.out.println("Total no of consonants are:" + consonantCount);
	}
}
