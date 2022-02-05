
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check(11211);

	}
	public static void Check(int input) {
		
		int temp=input;
		int sum=0;
		int reminder;
		while(temp>0) {
			reminder=temp%10;
			sum=sum*10+reminder;
			temp=temp/10;
		}
		if ( sum==input ) {
			System.out.println("Entered number is Palindrome Number");
		}
		else {
			System.out.println("Entered number is not Palindrome Number");
		}
	}

}


