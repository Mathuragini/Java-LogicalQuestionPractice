package com.java.ques;

public class RemoveDupArray {

	static int duplicatesCount(int arr[]) {

		int n = arr.length;

		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}

		return j;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };

		int len = RemoveDupArray.duplicatesCount(arr);
		for (int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");
	}

}
