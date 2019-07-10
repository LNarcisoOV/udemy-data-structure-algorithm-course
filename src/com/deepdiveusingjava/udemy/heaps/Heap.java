package com.deepdiveusingjava.udemy.heaps;

public class Heap {

	private int[] heap;
	private int size;

	public Heap(int capacity) {
		heap = new int[capacity];
	}

	public void insert(int value) {
		if (isFull()) {
			throw new ArrayIndexOutOfBoundsException("Heap is full.");
		}

		heap[size] = value;
		fixHeapAbove(size);
		size++;
	}

	public int delete(int index) {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("Heap is empty.");
		}

		int parent = getParent(index);
		int deletedValue = heap[index];
		heap[index] = heap[size - 1];

		if (index == 0 || heap[index] < heap[parent]) {
			fixHeapBelow(index, size - 1);
		} else {
			fixHeapAbove(index);
		}
		
		size--;
		
		return deletedValue;
	}

	private void fixHeapAbove(int index) {
		int newValue = heap[index];
		if (newValue > 0 && newValue > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}
		heap[index] = newValue;
	}

	private void fixHeapBelow(int index, int lastHeapIndex) {
		int childToSwap;

		while (index <= lastHeapIndex) {
			int leftChild = getChild(index, true);
			int rightChild = getChild(index, false);
			if (leftChild <= lastHeapIndex) {
				if (rightChild > lastHeapIndex) {
					childToSwap = leftChild;
				} else {
					childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
				}

				if (heap[index] < heap[childToSwap]) {
					int tmp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = tmp;
				} else {
					break;
				}

				index = childToSwap;
			} else {
				break;
			}
		}
	}

	public boolean isFull() {
		return size == heap.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getParent(int index) {
		return (index - 1) / 2;
	}

	public int getChild(int index, boolean isLeft) {
		return 2 * index + (isLeft ? 1 : 2);
	}

	public int[] getHeap() {
		return heap;
	}

	public void setHeap(int[] heap) {
		this.heap = heap;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void printHeap(){
		for (int i = 0; i < size; i++){
			System.out.print(heap[i]);
			System.out.print(", ");
		}
	}
}
