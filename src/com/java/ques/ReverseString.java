package com.java.ques;

public class ReverseString {

	public static void reverse1() {
		String word = "hello";
		String reversed = "";
		char ch;

		for (int i = 0; i < word.length(); i++) {

			ch = word.charAt(i);
			reversed = ch + reversed;
		}

		System.out.println(reversed);
	}

	public static void reverse2() {
		String input = "method";

		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
	}

	public static void reverse3() {
		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i = arr.length - 1; i >= 0; i--)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {

		ReverseString.reverse3();

	}

}
