
public class DataConservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		System.out.println(Integer.toString(a).getClass().getSimpleName());// int to string
		System.out.println(String.valueOf(a).getClass().getSimpleName());// int to string
		String s = "123";
		System.out.println(Integer.parseInt(s)); // string into int
		System.err.println(Float.parseFloat(s));
		char c = '1';
		System.err.println(Integer.parseInt(Character.toString(c)));
		System.out.println(Integer.toBinaryString(a)); // int to binary
		System.out.println(Integer.toHexString(15));// int to haxadecimal
	}
}
