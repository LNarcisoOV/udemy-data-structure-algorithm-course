package com.deepdiveusingjava.udemy.sort;

import com.deepdiveusingjava.udemy.arrays.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArray = Arrays.createIntArray();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		sort(intArray);

		System.out.println("\nBubble sorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("\nOne of the most inefficient algorithms for sorting.\n"
				+ "It's possible to see by the numbers of 'fors' in the code, \n"
				+ "if the collection grows, the number of steps will grow too.\n"
				+ "Big-O: O(N²);");
		

	}

	private static void sort(int[] intArray) {
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int j = 0; j < lastUnsortedIndex; j++) {
				if (intArray[j] > intArray[j + 1]) {
					swap(intArray, j, j + 1);
				}
			}
		}
	}

	public static void swap(int array[], int j, int jPlusOne) {
		if (j == jPlusOne) {
			return;
		}

		int temp = array[j];
		array[j] = array[jPlusOne];
		array[jPlusOne] = temp;
	}
}
