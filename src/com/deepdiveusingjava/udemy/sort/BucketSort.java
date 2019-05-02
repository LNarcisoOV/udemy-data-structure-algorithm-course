package com.deepdiveusingjava.udemy.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.deepdiveusingjava.udemy.arrays.MainArray;

public class BucketSort {
	public static void main(String args[]) {
		System.out.println("::::: BUCKET SORT :::::");
		System.out.println();
		System.out.println("- Uses hashing.");
		System.out.println("- Makes assumptions about the data, like radix");
		System.out.println("and counting sort. Can sort in O(n) time.");
		System.out.println("- Performs best when hashed values of items being");
		System.out.println("sorted are evenly distributed, so there aren't");
		System.out.println("many collisions.");
		System.out.println();
		System.out.println("HOW IT WORKS?");
		System.out.println("- Distribute the items into buckets based on ");
		System.out.println("their hashed values(scattering phase).");
		System.out.println("- Sort the items in each bucket.");
		System.out.println("- Merge the buckets, can just concatenate them");
		System.out.println("(gathering phase)");
		System.out.println("- A generalization of counting sort.");
		System.out.println("- The values in bucket(X) must be greater than the ");
		System.out.println("values in bucket(x-1) and less than the values in");
		System.out.println("bucket(x+1).");
		System.out.println("This means that the hash function we use must meet");
		System.out.println("this requirement.");
		System.out.println();
		System.out.println("- Not in-place algorithm, uses extra memory.");
		System.out.println("Stability will depend on sort algorithm used to sort");
		System.out.println("the buckets - ideally, you want a stable sort.");
		System.out.println("- To achieve O(n), must have only one item per bucket.");
		System.out.println("- Insertion sort is often used to sort the buckets, ");
		System.out.println("because it is fast when the number of items is small.");

		System.out.println();
		System.out.println();
		bucketSort();
	}

	private static void bucketSort() {
		int[] intArray = MainArray.createIntArrayForBucketSort();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		bucketSortImplementation(intArray);

		System.out.println("\nBucket sorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	private static void bucketSortImplementation(int[] intArray) {
		List<Integer>[] buckets = new List[10];
		for (int i = 0; i < buckets.length; i++) {

			// Using linked lists for the buckets
			// buckets[i] = new LinkedList<Integer>();

			// Using vector for the buckets
			// buckets[i] = new Vector<Integer>();

			// Using array lists for the buckets
			buckets[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < intArray.length; i++) {
			// Inputing the value of the array in its
			// specific bucket, if the value is 54, it'll put
			// 54 in index 5, if the value is 91, it'll put
			// 91 in the index 9 of the array, we can have
			// more than one value in each index(bucket).
			buckets[hash(intArray[i])].add(intArray[i]);
		}

		for (List bucket : buckets) {
			Collections.sort(bucket);
		}

		int j = 0;
		for (int i = 0; i < buckets.length; i++) {
			for (int value : buckets[i]) {
				intArray[j++] = value;
			}
		}

	}

	private static int hash(int value) {
		// Getting the first radix of parameter value.
		// If value is 54, it'll return 5, if value is
		// 83 it'll return 8.
		return value / (int) 10;
	}

}
