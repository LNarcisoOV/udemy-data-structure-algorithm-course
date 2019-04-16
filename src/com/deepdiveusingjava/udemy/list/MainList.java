package com.deepdiveusingjava.udemy.list;

import java.util.ArrayList;
import java.util.List;

import com.deepdiveusingjava.udemy.model.Employee;

public class MainList {

	public static void main(String[] args) {
		System.out.println("::::: LIST EXAMPLES :::::");

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(123, "Jane", "Jones"));
		empList.add(new Employee(4567, "John", "Doe"));
		empList.add(new Employee(22, "Mary", "Smith"));
		empList.add(new Employee(3245, "Mike", "Wilson"));

		System.out.println();
		empList.forEach(employee -> System.out.println(employee));

		System.out.println();
		System.out.println("Be careful when you're putting or removing");
		System.out.println("an element in the list, it'll replace all");
		System.out.println("the others items one index ahead or before, ");
		System.out.println("if the list is big, it can be a problem. ");
		System.out.println();

		empList.add(3, new Employee(4568, "John", "Adams"));

		System.out.println("Employee list with 'John Adams':");
		empList.forEach(employee -> System.out.println(employee));

		Object[] employeeArray = empList.toArray(new Object[empList.size()]);

		System.out.println();
		System.out.println("Employee array:");
		for (Object emp : employeeArray) {
			System.out.println(emp);
		}
		
		System.out.println();
		System.out.println("Checking if 'Mary Smith' exists in the list:");
		System.out.println("To 'list.contains()' method return 'true', we have to implement");
		System.out.println("'equals()' method in Employee class, because 'list.contains()' ");
		System.out.println("will search for the reference of the object, even all the fields ");
		System.out.println("are the same. Implementing the 'equals()' method in Employee class, ");
		System.out.println("we'll override 'list.equals()' method, calling 'Employee.equals()'. ");
		System.out.println("'Mary Smith' exists? " + empList.contains(new Employee(22, "Mary", "Smith")));
		
		
	}
}
