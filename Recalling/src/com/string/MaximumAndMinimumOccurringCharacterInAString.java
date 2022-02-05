package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumAndMinimumOccurringCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "grass is greener on the other side";
		MinMaxChar(s);
	}

	public static void MinMaxChar(String input) {
		input = input.toLowerCase();
		input = input.replace(" ", "");
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length() - 1; i++) {
			if (map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
			} else {
				map.put(input.charAt(i), 1);
			}
		}
		Map<Integer, ArrayList<Character>> map1 = new HashMap<Integer, ArrayList<Character>>();
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (map1.containsKey(entry.getValue())) {
				map1.get(entry.getValue()).add(entry.getKey());
			} else {
				map1.put(entry.getValue(), new ArrayList<Character>());
				map1.get(entry.getValue()).add(entry.getKey());

			}
		}
		char maxCharacter = Collections.max(map1.get(map1.keySet().toArray()[map1.size() - 1]));
		char minCharacter = Collections.min(map1.get(map1.keySet().toArray()[0]));
		System.out.println("Maximum frequent character is :" + maxCharacter);
		System.out.println("Minimum frequent character is :" + minCharacter);
	}
}
