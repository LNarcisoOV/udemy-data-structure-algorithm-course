package com.deepdiveusingjava.udemy.sort;

import com.deepdiveusingjava.udemy.arrays.MainArray;

public class InsertionSort {

	public static void main(String... args) {
		System.out.println("::::: INSERTION SORT :::::  \n");

		int intArray[] = MainArray.createIntArray();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		insertionRecursionSort(intArray);

		System.out.println("\nInsertion sorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("\nThis algorithm will sort by partitions, ");
		System.out.println("comparing the first nonpartitioned ");
		System.out.println("index value with the other partitioned index ");
		System.out.println("and shifting it if it's smaller than before. ");
		System.out.println("It's a stable algorithm, so it won't swap ");
		System.out.println("elements with that same value. ");
		System.out.println("Big-O: O(N²); in the worst case.");

		System.out.println();
		System.out.println();
		System.out.println();

		video40InsertionSortedDescendingArray();
	}

	private static void insertionRecursionSort(int intArray[]) {
		for (int unsortedPartitionIndex = 1; unsortedPartitionIndex < intArray.length; unsortedPartitionIndex++) {

			int newElement = intArray[unsortedPartitionIndex];
			int i;

			for (i = unsortedPartitionIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}

			intArray[i] = newElement;
		}
	}

	private static void video40InsertionSortedDescendingArray() {
		System.out.println("::::: VIDEO 40 CHALLENGE ::::: ");
		System.out.println("::::: INSERTION SORT WIRH RECURSION :::::  \n");

		int intArray[] = MainArray.createIntArray();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		insertionSortRecursive(intArray, 1, intArray.length);

		System.out.println("\nInsertion sorted recursive array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	private static void insertionSortRecursive(int[] intArray, int start, int end) {
		if (start == end) {
			return;
		}

		int newElement = intArray[start];
		int i = start;

		if (intArray[start - 1] > intArray[start]) {
			intArray[start] = intArray[start - 1];
			intArray[start - 1] = newElement;
			i = 1;
		} else {
			i++;
		}

		insertionSortRecursive(intArray, i, end);
	}
}
