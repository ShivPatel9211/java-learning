
public class Factorail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(1));

	}
	public static int fact(int a) {
		if (a==0)
			return 1;
		int f=1;
		for(int i=a;i>0;i--) {
			f=f*i;
		}
		return f;
	}

}
