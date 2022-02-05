
public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Check("apple"));
		System.out.println(Check("dp"));
	}
	
	public static boolean Check(String st) {
		return st.toLowerCase().matches(".*[aeiou].*");
	}
}
