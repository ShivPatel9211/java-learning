package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test string";
		duplicate(str);
	}

	public static void duplicate(String input) {
		input = input.toLowerCase();
		input = input.replace(" ", "");
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
			} else {
				map.put(input.charAt(i), 1);
			}
		}
//		System.out.println(map);
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ", count:" + entry.getValue());
			}
		}
	}
}
