package com.deepdiveusingjava.udemy.sort;

import com.deepdiveusingjava.udemy.arrays.MainArray;

public class CountingSort {

	public static void main(String[] args) {
		System.out.println("::::: COUNTING SORT ::::: \n");

		int intArray[] = MainArray.createIntArrayForCountingSort();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		countingSort(intArray, 1, 10);

		System.out.println("\nCounting sorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("");
		System.out.println("- Makes assumptions about the data.");
		System.out.println("- Doesn't use comparisons.");
		System.out.println("- Counts the number of occurrences of each value.");
		System.out.println("(Can't work with floats, strings, etc...)");
		System.out.println("- Only works with non-negative discret value.");
		System.out.println("- Values must be within specific range.");
		System.out.println("- The range can't be too big!!!");
		System.out.println("");
		System.out.println("Not an in-place algorithm, we'll create a temporary extra array.");
		System.out.println("If we want the sort to be stable, we have to do some extra steps.");
		System.out.println("Big-O: O(n); Can achive this because we're making assumptions ");
		System.out.println("the data we're sorting.");

	}

	// Unsorted array values: 2,5,9,8,2,8,7,10,4,3.
	private static void countingSort(int[] intArray, int min, int max) {
		int[] countArray = new int[(max - min) + 1];

		// Counting each times the values repeat itself and
		// putting in its respective sorted position.
		for (int i = 0; i < intArray.length; i++) {
			countArray[intArray[i] - min]++;
		}

		int j = 0;

		// Sorting the input array.
		for (int i = min; i <= max; i++) {
			while (countArray[i - min] > 0) {
				intArray[j++] = i;
				countArray[i - min]--;
			}
		}
	}

}
