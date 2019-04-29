package com.deepdiveusingjava.udemy.hashtable;

import com.deepdiveusingjava.udemy.model.Employee;

public class SimpleHashTable {

	private Employee[] hashTable;

	public SimpleHashTable() {
		hashTable = new Employee[10];
	}

	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);

		// Avoiding collisions
		if (hashTable[hashedKey] != null) {
			System.out.println("Sorry, there's already an employee at this position, " + hashedKey);
		} else {
			hashTable[hashedKey] = employee;
		}
	}

	public Employee get(String key) {
		int hashedKey = hashKey(key);
		return hashTable[hashedKey];
	}

	private int hashKey(String key) {
		return key.length() % hashTable.length;
	}

	public void print() {
		System.out.println();
		for (Employee employee : hashTable) {
			System.out.println(employee);
		}
		System.out.println();
	}

}
