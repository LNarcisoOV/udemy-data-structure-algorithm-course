package com.deepdiveusingjava.udemy.sort;

import com.deepdiveusingjava.udemy.arrays.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("::::: SELECTION SORT :::::  \n");
		
		int intArray[] = Arrays.createIntArray();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		sort(intArray);

		System.out.println("\nSelection sorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("\n\nIt looks like a bubble sort algorithm, \nbut there are fewer swaps than bubble sort, \n"
				+ "because it will compare the current value against the largest \nelement and passing only the "
				+ "index with the biggest value \nto be replaced in the last unsorted index. \n"
				+ "It's an unstable algorithm, so it will swap \nelements with that same value. \n"
				+ "In a nutshell this algorithm will sort the array putting the biggest value \nin the last unsorted index.\n"
				+ "Big-O: O(N²); in the worst case.");
	}

	private static void sort(int[] intArray) {
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
			int largestElementIndex = 0;
			for (int i = 0; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largestElementIndex]) {
					largestElementIndex = i;
				}
			}
			swap(intArray, largestElementIndex, lastUnsortedIndex);
		}
	}

	public static void swap(int array[], int largestElementIndex, int lastUnsortedIndex) {
		if (largestElementIndex == lastUnsortedIndex) {
			return;
		}

		int temp = array[largestElementIndex];
		array[largestElementIndex] = array[lastUnsortedIndex];
		array[lastUnsortedIndex] = temp;
	}

}
