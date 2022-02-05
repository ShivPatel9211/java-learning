package com.JavaNumber;

public class PetersonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(145);

	}
	public static void check(int input) {
		int temp=input;
		int reminder;
		int sum=0;
		while(temp>0) {
			reminder=temp%10;
			sum = sum+ new Factorial().Fact(reminder);
			temp=temp/10;
		}
		if (input==sum) {
			System.out.println("Peterson Number");
		}
		else {
			System.out.println("Not Peterson Number");
		}
	}
}
class Factorial{
	public int Fact(int num) {
		int fact=1;
		if(num==0||num==1) {
			fact=1;
		}
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
}