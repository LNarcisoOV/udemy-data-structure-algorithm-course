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

	public void addBefore(Employee current, Employee newEmployeeNode) {
		EmployeeNode newNode = new EmployeeNode(newEmployeeNode);
		EmployeeNode empNodeToBeReplaced = null;

		if (isEmpty()) {
			head = newNode;
		} else {

			// If the current parameter is null.
			if (current == null) {
				current = head.getEmployee();
			}

			empNodeToBeReplaced = head;

			// If there's only one item in the list.
			if (empNodeToBeReplaced.getNext() == null) {
				newNode.setNext(empNodeToBeReplaced);
				head = newNode;
			} else {
				//Searching the desired element and changing its 
				//references in a recursive way.
				percourListFindItemAndSwapIt(newNode, empNodeToBeReplaced, current);
			}

		}
	}

	private void percourListFindItemAndSwapIt(EmployeeNode newNode, EmployeeNode empNodeToBeReplaced, Employee current) {
		if (empNodeToBeReplaced != null && empNodeToBeReplaced.getEmployee().getId() == current.getId()) {
			swapElements(newNode, empNodeToBeReplaced);
			return;
		}
		percourListFindItemAndSwapIt(newNode, empNodeToBeReplaced.getNext(), current);
	}

	private void swapElements(EmployeeNode newNode, EmployeeNode empNodeToBeReplaced) {
		newNode.setNext(empNodeToBeReplaced);
		if (empNodeToBeReplaced.getPrevious() == null) {
			head = newNode;
		} else {
			empNodeToBeReplaced.getPrevious().setNext(newNode);
			newNode.setPrevious(empNodeToBeReplaced.getPrevious());
			empNodeToBeReplaced.setPrevious(newNode);
		}
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
