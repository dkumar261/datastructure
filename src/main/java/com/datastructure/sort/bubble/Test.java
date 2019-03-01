package com.datastructure.sort.bubble;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };

		for (int pass = 1; pass < arr.length; ++pass) {

			for (int j = 0; j < arr.length - pass; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
