package com.zensar;

public class Sort {
	public static void main(String[] args) {
		int arr[] = { 11, 1, 4, 5, 2, 8, 9 };
		for (int k = 0; k < arr.length; k++) {
			int min = k;
			for (int i = k; i < arr.length - 1; i++) {
				if (arr[i + 1] < arr[min]) {
					min = i + 1;
				}
			}
			int temp = 0;
			temp = arr[k];
			arr[k] = arr[min];
			arr[min] = temp;
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
