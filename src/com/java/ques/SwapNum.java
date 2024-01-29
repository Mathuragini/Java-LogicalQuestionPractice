package com.java.ques;

public class SwapNum {

	public static void tempVaraible() {
		int x = 5, y = 6;

		int temp = x;
		x = y;
		y = temp;

		System.out.print("temp :" + x + "," + y);
	}

	public static void swap() {
		int a = 2, b = 3;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.print("swap :" + a + "," + b);
	}

	public static void main(String[] args) {
		SwapNum.tempVaraible();
		SwapNum.swap();
	}
}
