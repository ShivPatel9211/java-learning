package com.JavaNumber;

public class NumberIsFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci(52);
	}

	public static void Fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		int result = 0;
		for (int i = 0; i <= n; i++) {
			if (a == n) {
				result = 1;
				break;
			}
			a = b;
			b = c;
			c = a + b;
		}
		if (result == 1) {
			System.out.println("fib number");
		} else {
			System.out.println("not fib number");
		}
	}
}
