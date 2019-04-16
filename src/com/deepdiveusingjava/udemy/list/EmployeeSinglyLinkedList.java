package com.deepdiveusingjava.udemy.list;

import com.deepdiveusingjava.udemy.model.Employee;
import com.deepdiveusingjava.udemy.model.EmployeeNode;

public class EmployeeSinglyLinkedList {

	private EmployeeNode head;
	private int size = 0;
	
	public void addToFront(Employee employee){
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public EmployeeNode removeFromFront(){
		if(isEmpty()){
			return null;
		}
		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		return removedNode;
	}
	
	public void printList(){
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while(current != null){
			System.out.print(current.toString());
			System.out.println(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

	public int getSize() {
		return size;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
}
