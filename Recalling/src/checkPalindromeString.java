
public class checkPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(check("aba"));
System.out.println(check("apple"));
System.out.println(check("abpba"));
	}
	public static boolean check(String input) {
		int len=input.length();
		for(int j=0;j<len/2;j++) {
			if( input.charAt(j) != input.charAt(len-1-j)) {
				return false;
			}
		}
		return true;
	}

}
