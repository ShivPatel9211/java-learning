import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello World";
		FindFrequency(s);
	}
	public static void FindFrequency(String input) {
		input = input.replaceAll("\\s+", "");
		input = input.toLowerCase();
		System.out.println(input);
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			int count = 1;
			if (map.containsKey(input.charAt(i))) {
				count = map.get(input.charAt(i));
				count++;
				map.put(input.charAt(i), count);
//				map.get(input.charAt(i))=count;
			}
			else {
				map.put(input.charAt(i), count);
			}
		}
		map.forEach ((k, v) -> {
			System.out.println(k + ":" + v);
		});
	}
}
