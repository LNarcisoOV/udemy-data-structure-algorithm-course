package com.deepdiveusingjava.udemy.list;

import com.deepdiveusingjava.udemy.model.Employee;
import com.deepdiveusingjava.udemy.model.EmployeeNode;

public class EmployeeDoubleLinkedList {

	EmployeeNode head;
	EmployeeNode tail;
	private int size;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		if (head != null) {
			head.setPrevious(node);
		} else {
			tail = node;
		}
		head = node;
		size++;
	}

	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (tail != null) {
			tail.setNext(node);
		} else {
			head = node;
		}
		node.setPrevious(tail);
		tail = node;
		size++;
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		head = head.getNext();
		head.setPrevious(null);
		size--;
		return removedNode;
	}

	public EmployeeNode removeFromEnd() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = tail;
		tail = tail.getPrevious();
		tail.setNext(null);
		size--;
		return removedNode;
	}

	public int getSize() {
		return size;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current.toString());
			System.out.println(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

	private boolean isEmpty() {
		return head == null;
	}
}
