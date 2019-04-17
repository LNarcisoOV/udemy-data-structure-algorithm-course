package com.deepdiveusingjava.udemy.list;

import java.util.LinkedList;

import com.deepdiveusingjava.udemy.model.Employee;

public class JDKLinkedList {
	public static void main(String args[]){
		System.out.println("::::: JDK LINKED LIST CLASS :::::");
		System.out.println();

		System.out.println("- It's a DOUBLE LINKED LIST implementation by JDK.");
		System.out.println("- This implementation isn't SYNCHRONIZED, therefore,");
		System.out.println("isn't thread safe.");
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		creatingShowingAndTestingJDKLinkedList();
	}

	private static void creatingShowingAndTestingJDKLinkedList() {
		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
		
		LinkedList<Employee> list = new LinkedList<>();
		
		System.out.println("ADDING ITEMS TO THE FRONT OF THE LIST:");
		list.addFirst(janeJones);
		list.addFirst(johnDoe);
		list.addFirst(marySmith);
		list.addFirst(mikeWilson);
		printList(list);
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("ADDING BILL END TO THE END OF THE LIST:");
		Employee billEnd = new Employee(78, "Bill", "End");
		list.add(billEnd);		
		printList(list);
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("ADDING CARLOS END TO THE END OF THE LIST");
		System.out.println("WITH ADDLAST() METHOD:");
		Employee carlosEnd = new Employee(79, "Carlos", "End");
		list.addLast(carlosEnd);
		printList(list);
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("REMOVING THE FIRST ITEM OF THE LIST:");
		list.removeFirst();
		printList(list);
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("REMOVING THE LAST ITEM OF THE LIST:");
		list.removeLast();
		printList(list);
		System.out.println("----------------------------------------------------------------------");
		
	}
	
	private static void printList(LinkedList<Employee> list){
		System.out.println("HEAD -> ");
		list.forEach(e -> System.out.println(e + " <=>"));
		System.out.println("null ");
		System.out.println();
	}
}
