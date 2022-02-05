
public class Reverse {
public static void main(String[] args) {
	System.out.println(reserveString("123"));
}
public static String reserveString(String st) {
	if (st==null) {
		throw new IllegalArgumentException("Null is not a valid input");
	}
	StringBuilder str=new StringBuilder();
	char c[]=st.toCharArray();
	for(int i = c.length-1;i>=0;i--) {
		str.append(c[i]);
	}
//	System.out.println(str.getClass().getName());
	return str.toString();
}
}
