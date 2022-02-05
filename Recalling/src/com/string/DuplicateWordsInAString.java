package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Big black bug bit a big black dog on his big black nose";
		duplicate(s);
	}

	public static void duplicate(String input) {
		input = input.toLowerCase();
		String[] words = input.split(" ");
		Set<String> set = new HashSet<>();
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					set.add(words[i]);
				}

			}
		}
		System.out.println(set);
	}
}
