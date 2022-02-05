import java.lang.Math;  
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Check(1634);
		FindArmstrongNumber(10000);

	}
	public static void Check(int input) {
		int temp=input;
		int reminder;
		int sum=0;
		int digit=0;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		temp=input;
		while(temp>0) {
			reminder=temp%10;
			sum=sum+(int)Math.pow(reminder,digit);
			temp=temp/10;
		}
		if ( sum==input ) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
	
	public static void FindArmstrongNumber(int limit) {
		if (limit==0) {
			System.out.println("limit can't be 0");
		}
		else {
			for(int i =1;i<=limit;i++) {
				int temp=i;
				int digit=0;
				while(temp>0) {
					temp=temp/10;
					digit++;
				}
				temp=i;
				int sum=0;
				int r;
				while(temp>0) {
					r=temp%10;
					sum=sum+(int)Math.pow(r, digit);
					temp=temp/10;
				}
				if (sum==i) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
