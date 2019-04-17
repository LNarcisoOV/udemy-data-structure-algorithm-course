package com.deepdiveusingjava.udemy.list;

import com.deepdiveusingjava.udemy.model.Employee;
import com.deepdiveusingjava.udemy.model.EmployeeNode;

public class DoubleLinkedList {
	public static void main(String[] args) {
		System.out.println("::::: DOUBLE LINKED LIST :::::");
		System.out.println();

		System.out.println("It's called DOUBLE LINKED LIST because we have three");
		System.out.println("fields in each node, two of them are to store the reference");
		System.out.println("of the previous and next item, and one is for the object itself.");
		System.out.println();
		System.out.println("The 'HEAD' and 'TAIL' are always the first and the last item in");
		System.out.println("list respectively, therefore, the previous of HEAD is always null");
		System.out.println("and the next of the TAIL is always null.");
		System.out.println();
		System.out.println("- INSERT:");
		System.out.println("If you have to put another item in the list, you just have to");
		System.out.println("know only the HEAD or the TAIL of the list, you'll create a new ");
		System.out.println("node and assign it as a HEAD or TAIL of the list, and put the reference ");
		System.out.println("of the old HEAD or TAIL in the new fields, it'll will be a constant");
		System.out.println("time O(1).");
		System.out.println("- Steps to insert an item in the list:");
		System.out.println("	-Create a new node 'Bill'.");
		System.out.println("	-Assign 'Jane' to Bill's next field.");
		System.out.println("	-Assign HEAD or TAIL to next or previous field.");
		System.out.println("	-Assign 'Bill' to next or previous field.");
		System.out.println("	-Assign HEAD or TAIL to 'Bill'.");
		System.out.println("- Big-O: O(1);");
		System.out.println();
		System.out.println("- DELETE:");
		System.out.println("As with the insert operation, to delete a node of the double linked ");
		System.out.println("list, we'll be O(1) time complexity, because we have just to change the ");
		System.out.println("reference of the previous and next item of the deleted node, assigning");
		System.out.println("it as a HEAD or TAIL. ");
		System.out.println("- Steps to delete an item in the list:");
		System.out.println("	-Assign 'Jane' to a temporary variable 'removedNode'.");
		System.out.println("	-Assign 'John' as previous field to Jane's previous field.");
		System.out.println("	-Assign HEAD or TAIL to Jane's next or previous field.");
		System.out.println("	-return 'removedNode' from the method.");
		System.out.println("- Big-O: O(1);");
		System.out.println();
		System.out.println("- DELETE AND ITEM BETWEEN OTHER ITEMS:");
		System.out.println("- Steps to delete an item in the list:");
		System.out.println("	-Assign 'A' to a temporary variable 'removedNode'.");
		System.out.println("	-Assign 'C' as previous field to A's previous field.");
		System.out.println("	-Assign 'B' as next field to A's next field.");
		System.out.println("	-return 'A' from the method.");
		System.out.println("- Big-O: O(N) because we have to find 'A';");
		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		System.out.println();

		creatingPopulatingAndShowingEmployeeDoubleLinkedList();
	}

	private static void creatingPopulatingAndShowingEmployeeDoubleLinkedList() {
		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");

		EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();

		System.out.println("ADDING ITEMS TO THE FRONT OF LIST:");
		System.out.println("----------------------------------------------------------------------");
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		list.printList();

		System.out.println();
		System.out.println("ADDING ITEMS TO THE END OF LIST:");
		System.out.println("----------------------------------------------------------------------");
		Employee billEnd = new Employee(78, "Bill", "End");
		Employee carlosEnd = new Employee(79, "Carlos", "End");
		list.addToEnd(billEnd);
		list.addToEnd(carlosEnd);
		list.printList();

		System.out.println();
		System.out.println("REMOVING MIKE WILSON OF THE LIST:");
		System.out.println("----------------------------------------------------------------------");
		list.removeFromFront();
		list.printList();

		System.out.println();
		System.out.println("REMOVING CARLOS END OF THE LIST:");
		System.out.println("----------------------------------------------------------------------");
		list.removeFromEnd();
		list.printList();
		
		System.out.println();
		System.out.println();
		video53Challenge();
	}
	 

	private static void video53Challenge() {
		System.out.println("VIDEO 53 CHALLENGE:");
		System.out.println("----------------------------------------------------------------------");
		
		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
		Employee newEmployeeToAddBefore = new Employee(30, "newEmployee", "toAddBefore");
		
		EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		list.addBefore(marySmith, newEmployeeToAddBefore);
		
//		list.addBefore(null, newEmployeeToAddBefore);
		
		list.printList();
	}
}
