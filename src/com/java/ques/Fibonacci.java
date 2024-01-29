package com.java.ques;

public class Fibonacci {

	public static void main(String[] args) {

		int num1 = 0, num2 = 1;
		int N = 10;

		for (int i = 0; i < N; i++) {
			// Print the number
			System.out.print(num1 + " ");

			// Swap
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
		}
	}

}
