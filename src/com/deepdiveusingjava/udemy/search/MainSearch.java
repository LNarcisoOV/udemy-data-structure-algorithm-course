package com.deepdiveusingjava.udemy.search;

import com.deepdiveusingjava.udemy.arrays.MainArray;

public class MainSearch {
	public static void main(String args[]) {
		System.out.println("::::: LINEAR SEARCH ALGORITHM :::::");
		System.out.println("It's a simple search.");
		System.out.println("We'll traverse the array until find '-15' value ");
		System.out.println("and we'll store the position of '-15' in a variable.");
		System.out.println("BigO: O(n);");
		System.out.println();
		System.out.println("Our array: ");
		int[] intArray = MainArray.createIntArrayForLinearSearchAlgorithm();
		
		System.out.print("intArray[ ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("];");
		
		System.out.println();
		
		System.out.println("Position of '-15': " + executeLinearSearch(intArray, -15));
		System.out.println("Position of '1': " +executeLinearSearch(intArray, 1));
		System.out.println("Position of '8888': " +executeLinearSearch(intArray, 8888));
		System.out.println("Position of '-22': " +executeLinearSearch(intArray, -22));
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
}
