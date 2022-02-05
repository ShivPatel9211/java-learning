
public class removeWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch="  This is testing  ";
		Remove(ch);
		System.out.println(ch.trim());

	}
public static void Remove(String input) {
	StringBuilder st=new StringBuilder();
	char[] st2=input.toCharArray();
	for(char c:st2) {
		if (!Character.isWhitespace(c)) {
			st.append(c);
		}
	}
	System.out.println(st.toString());
}
}
