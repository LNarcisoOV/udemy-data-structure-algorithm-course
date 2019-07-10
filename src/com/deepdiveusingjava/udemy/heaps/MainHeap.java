package com.deepdiveusingjava.udemy.heaps;

public class MainHeap {
	public static void main(String args[]) {
		System.out.println("::::: HEAPS ::::: ");
		System.out.println("");
		System.out.println("- Special type of binary tree.");
		System.out.println("- A complete binary tree.");
		System.out.println("- Must satisfy the heap porperty.");
		System.out.println("- Max heap: Every parent is greater than or equal to its children.");
		System.out.println("- Min heap: Every parent is less than or equal to its children.");
		System.out.println("- Each children are added from left to right.");
		System.out.println("- Usually implemented as arrays.");
		System.out.println("- THE MINIMUM OR MAXIMUM VALUES WILL ALWAYS AT THE TOP OF ");
		System.out.println("THE TREE - THE ADVANTAGE OF USING HEAP.");
		System.out.println("- HEAPFY: process of converting a binary tree into a heap,");
		System.out.println("this often has to be done after insertion or deletion.");
		System.out.println("- No required ordering between siblings.");
		System.out.println("");
		System.out.println("::::: HEAPS AS ARRAYS ::::: ");
		System.out.println("- We can store binary heaps as arrays");
		System.out.println("- We put the root at array[0].");
		System.out.println("- We then traverse each level from left to right and so the left child ");
		System.out.println("of the root would go int array[1], its right child would to into array[2],");
		System.out.println("etc...");

		System.out.println();
		System.out.println();
		System.out.println("::::: HEAP IMPLMEMENTATION ::::: ");
		System.out.println();
		
		System.out.print("Creating heap. \nHEAP[");
		Heap heap = createHeapBinaryTree();
		System.out.println("]");
		System.out.println();
		deleteSomeNodes(heap);
	}

	private static Heap createHeapBinaryTree() {
		Heap heap = new Heap(10);
		
		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);
		
		
		heap.printHeap();
		
		return heap;
	}
	
	private static void deleteSomeNodes(Heap heap) {
		System.out.println("Deleting index 1 of the HEAP.");
		System.out.print("HEAP[");
		heap.delete(1);
		heap.printHeap();
		System.out.print("]");
		System.out.println();
		System.out.println("Deleting index 5 of the HEAP.");
		System.out.print("HEAP[");
		heap.delete(5);
		heap.printHeap();
		System.out.print("]");
	}
}
