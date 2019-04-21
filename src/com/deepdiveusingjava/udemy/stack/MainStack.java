package com.deepdiveusingjava.udemy.stack;

import com.deepdiveusingjava.udemy.model.Employee;

public class MainStack {
	public static void main(String[] args) {
		System.out.println("::::: STACK :::::");
		System.out.println();

		System.out.println("It's the same singly linked list implementation.");
		System.out.println("All the operations will be with the HEAD of ");
		System.out.println("the list.");
		System.out.println("There're 3 basic operations:");
		System.out.println("- PUSH, which we'll put the item on the top of the stack.");
		System.out.println("- POP, which we'll remove the item of the top of the stack");
		System.out.println("and return its item.");
		System.out.println("- PEEK, which will return the item without removing it.");
		
		System.out.println();
		System.out.println();
		
		creatingPopulatingAndWorkingEmployeeStack();

	}

	private static void creatingPopulatingAndWorkingEmployeeStack() {
		LinkedStack stack = new LinkedStack();
		
		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Pushing four employees:");
		
		stack.push(janeJones);
		stack.push(johnDoe);
		stack.push(marySmith);
		stack.push(mikeWilson);
		
		stack.printStack();
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Peek:");
		System.out.println(stack.peek());
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Pop:" );
		System.out.println(stack.pop());
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Stack after pop:");
		stack.printStack();
		
	}
}
