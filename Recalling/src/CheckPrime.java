import java.util.Scanner;
public class CheckPrime {
public static void main(String[] args) {
	PrimeNumber();
}
public static void PrimeNumber() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	if (num==0 || num==1) {
		System.out.println("Enter number is not Prime Number");
	}
	else {
		int temp=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if (temp ==0) {
			System.out.println("Entered Numner is Prime");
		}
		else {
			System.out.println("Enter Number is Not Prime");
		}
	}
}
}
