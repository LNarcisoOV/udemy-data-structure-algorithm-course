package com.deepdiveusingjava.udemy.sort;

import com.deepdiveusingjava.udemy.arrays.Arrays;

public class QuickSort {
	public static void main(String args[]) {
		System.out.println("::::: QUICK SORT ::::: \n");

		int intArray[] = Arrays.createIntArray();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		quickSort(intArray, 0, intArray.length);

		System.out.println("\nMerge sorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("");
		System.out.println("- Divided and conquer algorithm.");
		System.out.println("- Recursive algorithm. ");
		System.out.println("- Two phases: Splitting and Merging. ");
		System.out.println("- Uses a pivot to partition the array in two parts.");
		System.out.println("- Elements < pivot will be in the left, ");
		System.out.println("elements > pivot will be in the right.");
		System.out.println("- Pivot will then be in correct sorted position.");
		System.out.println("- Process is now repeated for the leff and right array.");
		System.out.println("- Eventually each element has been the pivot, so every ");
		System.out.println("element will be in its correct sorted position.");
		System.out.println("- As with merge sort, we'll end up partioning the array ");
		System.out.println("into a series of 1-element arrays.");
		System.out.println("");
		System.out.println("");
		System.out.println("In-Place algorithm, we don't have to create temporary variables");
		System.out.println("Unstable algorithm, we won't preserve the order of elements ");
		System.out.println("with the same value.");
		System.out.println("Big-O? O(NlogN);");
	}

	private static void quickSort(int[] intArray, int start, int end) {
		if (end - start < 2) {
			return;
		}

		int pivotIndex = partition(intArray, start, end);
		quickSort(intArray, start, pivotIndex);
		quickSort(intArray, pivotIndex + 1, end);
	}

	private static int partition(int[] intArray, int start, int end) {
		// Using the first element as the pivot.
		int pivot = intArray[start];
		int i = start;
		int j = end;

		while (i < j) {
			// NOTE: empty loop body
			while (i < j && intArray[--j] >= pivot);
			
			if (i < j) {
				intArray[i] = intArray[j];
			}

			// NOTE: empty loop body
			while (i < j && intArray[++i] <= pivot);
			if (i < j) {
				intArray[j] = intArray[i];
			}
		}
		
		intArray[j] = pivot;
		return j;
	}

}
