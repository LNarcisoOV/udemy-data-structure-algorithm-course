package com.deepdiveusingjava.udemy.sort;

import com.deepdiveusingjava.udemy.arrays.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		System.out.println("::::: RADIX SORT ::::: \n");

		int intArray[] = Arrays.createIntArrayForRadixSort();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		radixSort(intArray, 10, 4);

		System.out.println("\nCounting sorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("");
		System.out.println("- Makes assumptions about the data.");
		System.out.println("- Data must have same RADIX and WIDTH.");
		System.out.println("- Data must be integers or strings.");
		System.out.println("(Can't work with floats.)");
		System.out.println("- Sort based on each individual digit or letter position.");
		System.out.println("- Start at the rightmost position of each value.");
		System.out.println("- Must use a stable sort algorithm at each stage.");
		System.out.println("");
		System.out.println("How it works?");
		System.out.println("We'll percour each value in the array, beginning the comparison ");
		System.out.println("by the rightmost digit of each item, and sorting by this digit, ");
		System.out.println("after that we'll percour the array again comparing the two rightmost ");
		System.out.println("values and sorting by they, this process will repeat until we percour ");
		System.out.println("the whole array as well as the each rightmost values in the item ");
		System.out.println("until its end.");
		System.out.println();
		System.out.println("Stable algorithm, we'll preserve the position of equal values ");
		System.out.println("of the sorted item, as well as the comparative digit of each item. ");
		System.out.println("Even so, it often runs slower than O(NlogN) algorithms because of the ");
		System.out.println("overhead involved.");
		System.out.println("Not an In-place algorithm, we'll create a temporary extra array.");
		System.out.println("Big-O: O(n); Can achive this because we're making assumptions ");
		System.out.println("the data we're sorting.");

	}

	private static void radixSort(int[] intArray, int radix, int width) {
		for (int i = 0; i < width; i++) {
			radixSingleSort(intArray, i, radix);
		}
	}

	private static void radixSingleSort(int[] intArray, int position, int radix) {
		int numItems = intArray.length;
		int[] countArray = new int[radix];

		for (int value : intArray) {
			countArray[getDigit(position, value, radix)]++;
		}

		// Adjust the count array
		for (int j = 1; j < radix; j++) {
			countArray[j] += countArray[j - 1];
		}

		int[] tempArray = new int[numItems];

		for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
			tempArray[--countArray[getDigit(position, intArray[tempIndex], radix)]] = intArray[tempIndex];
		}
		
		for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
			intArray[tempIndex] =  tempArray[tempIndex];
		}
	}

	private static int getDigit(int position, int value, int radix) {
		return value / (int) Math.pow(radix, position) % radix;
	}

}
