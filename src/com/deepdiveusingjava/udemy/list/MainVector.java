package com.deepdiveusingjava.udemy.list;

import java.util.List;
import java.util.Vector;

import com.deepdiveusingjava.udemy.model.Employee;

public class MainVector {
	public static void main(String[] args) {
		System.out.println("::::: VECTOR EXAMPLES :::::");
		
		System.out.println();
		System.out.println("The big difference between VECTORs and ARRAYLISTs is ");
		System.out.println("that the VECTOR is THREAD SAFE, we have a SYNCRONIZED methods ");
		System.out.println("in this class. In ARRAYLIST, the methods are multithread, wich ");
		System.out.println("can do some conflicts when we are working with this type of collection.");
		
		List<Employee> empList = new Vector<>();
		empList.add(new Employee(123, "Jane", "Jones"));
		empList.add(new Employee(4567, "John", "Doe"));
		empList.add(new Employee(22, "Mary", "Smith"));
		empList.add(new Employee(3245, "Mike", "Wilson"));

		System.out.println();
		empList.forEach(employee -> System.out.println(employee));
	}
}
