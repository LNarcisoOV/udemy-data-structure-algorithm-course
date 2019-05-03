package com.deepdiveusingjava.udemy.search;

import com.deepdiveusingjava.udemy.arrays.MainArray;

public class MainSearch {
	public static void main(String args[]) {
		linearSearch();
		System.out.println();
		System.out.println();
		binarySearch();

	}

	private static void linearSearch() {
		System.out.println("::::: LINEAR SEARCH :::::");
		System.out.println("- It's a simple search.");
		System.out.println("- We'll traverse the array until find the wished value ");
		System.out.println("and we'll store the position of wished value in a variable.");
		System.out.println("- BigO: O(n);");
		System.out.println();
		System.out.println("Our array: ");
		int[] intArray = MainArray.createIntArrayForLinearSearchAlgorithm();

		System.out.print("intArray[ ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("];");

		System.out.println();

		System.out.println("POSITION OF '-15': " + executeLinearSearch(intArray, -15));
		System.out.println("POSITION OF '1': " + executeLinearSearch(intArray, 1));
		System.out.println("POSITION OF '8888': " + executeLinearSearch(intArray, 8888));
		System.out.println("POSITION OF '-22': " + executeLinearSearch(intArray, -22));
	}

	private static int executeLinearSearch(int[] intArray, int value) {
		int position = -1;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == value) {
				position = i;
				break;
			}
		}
		return position;
	}

	private static void binarySearch() {
		System.out.println("::::: BINARY SEARCH :::::");
		System.out.println("- Data must be sorted.");
		System.out.println("- Chooses the element in the middle of the array");
		System.out.println("and compares it against he search value.");
		System.out.println("- If element is equal to the value, we're done.");
		System.out.println("- If element is greater than the value, search the ");
		System.out.println("left half of the array.");
		System.out.println("- If element is less than the value, search the ");
		System.out.println("right half of the array.");
		System.out.println("BigO: O(logN);");
		System.out.println();

		int[] intArray = MainArray.createIntArrayForBinarySearchAlgorithm();

		System.out.print("intArray[ ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("];");

		System.out.println();

		System.out.println("POSITION OF '-15': " + iterativeBinarySearch(intArray, -15));
		System.out.println("POSITION OF '35': " + iterativeBinarySearch(intArray, 35));
		System.out.println("POSITION OF '8888': " + iterativeBinarySearch(intArray, 8888));
		System.out.println("POSITION OF '1': " + iterativeBinarySearch(intArray, 1));

		System.out.println();
		System.out.println("IMPLEMENTATION OF BINARY SEARCH RECURSIVE.");
		recursiveBinarySearch(intArray, -15);
		recursiveBinarySearch(intArray, 35);
		recursiveBinarySearch(intArray, 8888);
		recursiveBinarySearch(intArray, 1);

	}

	private static int recursiveBinarySearch(int[] inputArray, int value) {
		return recursiveBinarySearch(inputArray, 0, inputArray.length, value);
	}

	private static int recursiveBinarySearch(int[] inputArray, int start, int end, int value) {
		if (start >= end) {
			return -1;
		}

		int midPoint = (start + end) / 2;
		System.out.println("MidPoint: " + midPoint);

		if (inputArray[midPoint] == value) {
			System.out.println("POSITION OF " + value + ": " + midPoint);
			return midPoint;
		} else if (inputArray[midPoint] < value) {
			return recursiveBinarySearch(inputArray, midPoint + 1, end, value);
		} else {
			return recursiveBinarySearch(inputArray, start, midPoint, value);
		}
	}

	private static int iterativeBinarySearch(int[] inputArray, int value) {
		int start = 0;
		int end = inputArray.length;

		while (start < end) {
			int midPoint = (start + end) / 2;
			System.out.println("midpoint: " + midPoint);
			if (inputArray[midPoint] == value) {
				return midPoint;
			} else if (inputArray[midPoint] < value) {
				start = midPoint + 1;
			} else {
				end = midPoint;
			}
		}
		return -1;
	}
}
