package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TopKFrequentElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 1, 1, 2, 3, 3, 3, 3, 4, 2, 5, 2, 4, 7 };
		int k = 2;
		TopKElement(arr, k);

	}

	public static void TopKElement(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			int count = 1;
			if (map.containsKey(i)) {
				count = map.get(i);
				count++;
				map.put(i, count);
			} else {
				map.put(i, count);
			}
		}
		Set<Entry<Integer, Integer>> entry = map.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<>(entry);
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
//		map.forEach((k,v)->{
//			System.out.println(k+":"+v);
//		});
//		for (int i = 0; i < list.size(); i++) {
//			int maxindex = i;
//			for (int j = i + 1; j < list.size(); j++) {
//				if (list.get(i).getValue() == list.get(j).getValue()) {
//					if (list.get(i).getKey() < list.get(j).getKey()) {
//						maxindex = j;
//					}
//				} else {
//					break;
//				}
//			}
//
//		}
		int result[] = new int[list.size()];
		List<Integer> list1 = new ArrayList<>();
		int i = 0;
		System.out.println(list);
//		System.out.println(list1);
		while (i < list.size() - 1) {
			int j = i + 1;
			System.out.println("begin");
			int maxIndex = 0;
			while (j < list.size() - 1) {
				if (list.get(i).getValue() == list.get(j).getValue()) {
					System.out.println(" inner if");
					if (list.get(i).getKey() < list.get(j).getKey()) {
						maxIndex = j;
						System.out.println("Inner inner if");
					} else {
						maxIndex = i;
						System.out.println("Inner inner else");
					}
					j++;
				} 
				else {
					System.out.println(" inner else");
					System.out.println(maxIndex);
					System.out.println(i);
					System.out.println(j);
					j++;
					break;

				}
			}
			i++;
		}

//		for (int j : result) {
//			System.out.print(j + " ");
//		}
	}
}
