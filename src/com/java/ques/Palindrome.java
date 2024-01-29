package com.java.ques;

public class Palindrome {

	static void number() {
		int r, sum = 0, temp;
		int n = 454;

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}

	static void string() {

		// Input string
		String str = "geeG";

		// Convert the string to lowercase
		str = str.toLowerCase();

		// of the original str
		String rev = "";

		// Initializing a new boolean variable for the
		// answer
		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		// Checking if both the strings are equal
		if (str.equals(rev)) {
			ans = true;
		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		Palindrome.string();
	}

}
