import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Series();
		
	}
public static void Series() {
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter the nth term of the series");
	int num=obj.nextInt();
	int a=0;
	int b=1;
	int c=1;
	if (num<1) {
		System.out.println(a);
	}
	else {
		for (int j =0;j<num;j++) {
			System.out.print(a +", ");
			a=b;
			b=c;
			c=a+b;
		}
	}
}
}
