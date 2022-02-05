package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class KthMostOccurringElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 1, 3, 5, 2, 2, 2, 2, 5, 1, 5 };
		int k = 2;
		findOccurance(arr, k);

	}

	public static void findOccurance(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
		HashMap<Integer, ArrayList<Integer>> local = new HashMap<>();
		for (Entry<Integer, Integer> i : map.entrySet()) {
			if (local.containsKey(i.getValue())) {
				local.get(i.getValue()).add(i.getKey());
			} else {
				local.put(i.getValue(), new ArrayList<Integer>());
				local.get(i.getValue()).add(i.getKey());
			}
		}
//		k = local.size() - k;
		System.out.println(local);
//		List<Integer> list = new ArrayList<Integer>();
//		for (Entry<Integer, ArrayList<Integer>> j : local.entrySet()) {
//			if (k == 0) {
//				Integer max = Collections.max(j.getValue());
//				list.add(max);
//			} else {
//				k = k - 1;
//			}
//		}
//		for (int j = list.size() - 1; j >= k; j--) {
//			System.out.print(list.get(j) + " ");
//		}

		for (int i = 1; i <= k; i++) {
			System.out.print(Collections.max(local.get(local.keySet().toArray()[local.size()-i])) + " ");
		}

	}

}
