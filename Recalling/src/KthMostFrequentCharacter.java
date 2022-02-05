import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.DocFlavor.CHAR_ARRAY;

public class KthMostFrequentCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "trichotillomania";
		int k = 2;
		KthFrequent(s, k);

	}

	public static void KthFrequent(String input, int k) {
		input = input.toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			int count = 1;
			if (map.containsKey(input.charAt(i))) {
				count = map.get(input.charAt(i));
				count++;
				map.replace(input.charAt(i), count);
			} else {
				map.put(input.charAt(i), count);
			}
		}
		
		Map<Integer,ArrayList<Character>> map1=new HashMap<>();
		for(Entry<Character, Integer> e:map.entrySet()) {
			if(map1.containsKey(e.getValue())) {
				map1.get(e.getValue()).add(e.getKey());
			}
			else {
				map1.put(e.getValue(), new ArrayList<Character>());
				map1.get(e.getValue()).add(e.getKey());
			}
		}
		System.out.println(map1);
		System.out.println(Collections.max(map1.get(map1.keySet().toArray()[k-1])));

//		Set<Entry<Character, Integer>> entry = map.entrySet();
//		List<Entry<Character, Integer>> list = new ArrayList<>(entry);
//		Collections.sort(list, new Comparator<Entry<Character, Integer>>() {
//
//			@Override
//			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
//				return o2.getValue().compareTo(o1.getValue());
//			}
//
//		});
//		System.out.println(list);
//		int temp = 0;
//		char c=0;
//		for (int i = 0; i < list.size()-1; i++) {
//			if ( list.get(i).getValue() == list.get(i + 1).getValue() ) {
////				c = list.get(i).getKey();
//				continue;
//			} else {
//				c = list.get(i).getKey();
//				temp++;
//			}
//			if(temp==k) {
//				break;
//			}
//		}
//		System.out.println(c);
//		
	}
}
