package com.assign.app;

public class SwapQuestion1 {

	public void swapNumber(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Value of a :" + a);
		System.out.println("Value of b :" + b);
	}

	public static void main(String[] args) {

		SwapQuestion1 swap = new SwapQuestion1();

		swap.swapNumber(5, 10);

	}

}
