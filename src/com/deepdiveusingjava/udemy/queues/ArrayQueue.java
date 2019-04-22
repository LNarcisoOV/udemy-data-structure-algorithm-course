package com.deepdiveusingjava.udemy.queues;

import java.util.NoSuchElementException;

import com.deepdiveusingjava.udemy.model.Employee;

public class ArrayQueue {
	private Employee[] queue;
	private int front;
	private int back;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	public void enqueue(Employee employee) {
		//Checking if the queue is full.
		if (back == queue.length) {
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;
		}

		queue[back] = employee;
		back++;
	}

	public Employee dequeue() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}

		Employee employee = queue[front];
		queue[front] = null;
		front++;

		if (size() == 0) {
			front = 0;
			back = 0;
		}

		return employee;
	}

	public Employee peek() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}

		return queue[front];
	}

	public int size() {
		return back - front;
	}

	public void print() {
		for (int i = front; i < back; i++) {
			System.out.println(queue[i]);
		}
		System.out.println();
	}



}
