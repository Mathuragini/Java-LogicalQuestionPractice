package com.java.ques;

public class SortArray {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 12, 4, 67, 23, 14, 89, 5 };
		int index = -1;

		for (int i = 0; i < array.length; i++) {
			index = i;
			for (int j = i; j <= array.length - 1; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}
}
