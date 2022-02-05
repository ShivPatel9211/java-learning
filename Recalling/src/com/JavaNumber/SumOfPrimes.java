package com.JavaNumber;

public class SumOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumPrime(123);
	}

	public static void sumPrime(int n) {
		int temp = n;
		int reminder;
		int sum = 0;
		while (temp > 0) {
			reminder = temp % 10;
//			System.out.println(reminder);
			int flag = 0;
			for (int i = 1; i <=reminder; i++) {
				if (reminder % i == 0) {
					flag++;
				}
			}
			if (flag == 2) {
				sum = sum + reminder;
			}
			temp = temp / 10;
		}
		System.out.println(sum);
	}
}
