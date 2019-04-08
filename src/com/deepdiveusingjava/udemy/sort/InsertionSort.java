package com.deepdiveusingjava.udemy.sort;

import com.deepdiveusingjava.udemy.arrays.Arrays;

public class InsertionSort {

	public static void main(String... args) {
		int intArray[] = Arrays.createIntArray();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		sort(intArray);

		System.out.println("\nInsertion sorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("This algorithm will sort by partitions, \ncomparing the first nonpartitioned \n"
		+ "index value with the other partitioned index \nand shifting it if it's smaller then before. \n"
		+ "It's a stable algorithm, so it won't swap \nelements with that same value. \n" 
		+ "Big-O: O(N²);");
	}

	private static void sort(int intArray[]) {
		for (int firstUnsortedPartitionIndex = 1; firstUnsortedPartitionIndex < intArray.length; firstUnsortedPartitionIndex++) {

			int newElement = intArray[firstUnsortedPartitionIndex];
			int i;

			for(i = firstUnsortedPartitionIndex; i > 0 && intArray[i-1] > newElement; i--){
				intArray[i] = intArray[i-1];
			}
			
			intArray[i] = newElement;
		}
	}
}
