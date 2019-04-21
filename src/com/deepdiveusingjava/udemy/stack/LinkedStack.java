package com.deepdiveusingjava.udemy.stack;

import java.util.LinkedList;

import com.deepdiveusingjava.udemy.model.Employee;

public class LinkedStack {
	LinkedList<Employee> stack;
	
	public LinkedStack() {
		stack = new LinkedList<>();
	}
	
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public Employee pop() {
		return stack.pop();
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack(){
		System.out.print("HEAD -> ");
		for(Employee emp : stack){
			System.out.print(emp.toString());
			System.out.println(" -> ");
		}
		System.out.println("null");
	}
}
