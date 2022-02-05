
public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsciValue obj=new AsciValue();
		System.out.println(obj.ascivalue('A'));
		

	}
}
class  AsciValue {
	int asciv;
	public int ascivalue (char input) {
		asciv=input;
		return asciv;
	}
}