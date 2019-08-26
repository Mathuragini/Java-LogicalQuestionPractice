package com.assign.app;

public class ReverseArrayQuestion3 {

	/*
	 * function that reverses array and stores it in another array
	 */
	static void reverse(int a[], int size) {
		int[] b = new int[size];
		int j = size;
		for (int i = 0; i < size; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}

		/* printing the reversed array */
		System.out.println("Reversed array is: ");
		for (int k = 0; k < size; k++) {
			System.out.println(b[k]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int size = arr.length;
		reverse(arr, size);

	}

}
