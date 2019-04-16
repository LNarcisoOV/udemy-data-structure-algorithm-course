package com.deepdiveusingjava.udemy.list;

import com.deepdiveusingjava.udemy.model.Employee;

public class SinglyLinkedList {
	public static void main(String[] args) {

		System.out.println("It's called SINGLY LINKED LIST because we have two fields, ");
		System.out.println("but only one field in each node to store the reference of ");
		System.out.println("the next item. So we wi'll do only insertions and deletions in");
		System.out.println("the 'HEAD' of the list.");
		System.out.println();
		System.out.println("Differently from array list, linked list aren't");
		System.out.println("backed by arrays. Linked lists has two fields in each 'node', ");
		System.out.println("the first field is the object itself, the second field is a ");
		System.out.println("pointer with the reference to he next 'node' in the list.");
		System.out.println();
		System.out.println("The first node of the linked list is the HEAD of the list.");
		System.out.println("The last node of the linked list is always null.");
		System.out.println();
		System.out.println("- INSERT:");
		System.out.println("If you have to put another item in the list, you just have to");
		System.out.println("know only the HEAD of the list, you'll create a new node and assign");
		System.out.println("it as a HEAD of the list, and put the reference of the old HEAD ");
		System.out.println("in the new HEAD, it'll will be a constant time O(1).");
		System.out.println("It'll be O(1) because we don't have to move anothers items one");
		System.out.println("position ahead, as we do with array lists because the linked list");
		System.out.println("will change only the reference of the new HEAD node.");
		System.out.println("- Steps to insert an item in the list:");
		System.out.println("	-Create a new node 'Bill'.");
		System.out.println("	-Assign 'Jane' to the next field in the new node.");
		System.out.println("	-Assign HEAD to 'BILL'.");
		System.out.println("- Big-O: O(1);");
		System.out.println();
		System.out.println("- DELETE:");
		System.out.println("As with the insert operation, to delete a node of the linked list");
		System.out.println("will be O(1) time complexity, because we have just to change the ");
		System.out.println("reference of the previous item of the deleted node.");
		System.out.println("- Steps to delete an item in the list:");
		System.out.println("	-Assign 'Bill' to a temporary variable 'removedNode'.");
		System.out.println("	-Assign HEAD to 'Jane'.");
		System.out.println("	-Return 'removedNode'.");
		System.out.println("- Big-O: O(1);");

		System.out.println();
		System.out.println();
		
		creatingPopulatingAndShowingEmployeeSinglyLinkedList();
	}

	private static void creatingPopulatingAndShowingEmployeeSinglyLinkedList() {
		System.out.println("::::: EMPLOYEE SINGLY LINKED LIST :::::");
		System.out.println();
		
		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");

		EmployeeSinglyLinkedList singlyLinkedList = new EmployeeSinglyLinkedList();

		System.out.println("ADDING ITEMS AND SHOWING LIST'S PROPERTIES:");
		System.out.println("----------------------------------------------------------------------");
		singlyLinkedList.addToFront(janeJones);
		singlyLinkedList.addToFront(johnDoe);
		singlyLinkedList.addToFront(marySmith);
		singlyLinkedList.addToFront(mikeWilson);
		singlyLinkedList.printList();
		System.out.println("List's size: " + singlyLinkedList.getSize());
		System.out.println("List is empty? " + singlyLinkedList.isEmpty());
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println();
		System.out.println("REMOVING ITEM AND SHOWING LIST'S PROPERTIES:");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Singly linked list only can remove the HEAD ");
		System.out.println("of the list.");
		System.out.println("Removing HEAD of the list.");
		
		singlyLinkedList.removeFromFront();
		
		singlyLinkedList.printList();
		System.out.println("List's size: " + singlyLinkedList.getSize());
		System.out.println("List is empty? " + singlyLinkedList.isEmpty());
		System.out.println("----------------------------------------------------------------------");
	}
}
