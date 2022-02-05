
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Shiv");
		map.put(5, "Ram");
		map.put(3, "Sita");
		System.out.println(map.putIfAbsent(4, "Sheetal"));
		System.out.println(map);
		HashMap <Integer,String> another=new HashMap<>();
		another.putAll(map);
		System.out.println(another);
		Set<Entry<Integer,String>> entryset = map.entrySet();
		for ( Entry<Integer,String>  entry : entryset){
		       System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println(map.get(2)); //get value at the particular keys
		System.out.println(map.containsKey(2));//to check key contain or not
		System.out.println(map.containsValue("sdcsc"));//to check the value contain or not
		System.out.println(map.size());//size
//		map.clear();
//		System.out.println(map.size());
//		map.remove(4);
		map.replace(4, "Rohan");
		map.replace(4, "Rohan", "Gita");
		Set<Integer> key = map.keySet();
		for(int i:key) {
			System.out.println(i);
		}
		java.util.Map<Integer,String> map1=Collections.synchronizedMap(map);
		System.out.println(map1);
		
		
		Collection<String> value =map.values();
		for(String st: value) {
			System.out.println(st);
		}

		
		List<Entry<Integer,String>> list1=new ArrayList<>(entryset);
		Collections.sort(list1, new Comparator<Entry<Integer,String>>() {
			@Override
			public int compare(Entry<Integer,String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
	System.out.println(list1.get(1).getValue());
		
	}

}
