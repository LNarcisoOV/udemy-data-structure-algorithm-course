package com.deepdiveusingjava.udemy.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

import com.deepdiveusingjava.udemy.model.Employee;

public class ChainedHashTable {

	private LinkedList<StoredEmployee>[] hashTable;

	public ChainedHashTable() {
		hashTable = new LinkedList[10];
		for (int i = 0; i < hashTable.length; i++) {
			hashTable[i] = new LinkedList<StoredEmployee>();
		}
	}

	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		hashTable[hashedKey].add(new StoredEmployee(key, employee));
	}

	public Employee get(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
		StoredEmployee storedEmployee = null;
		while (iterator.hasNext()) {
			storedEmployee = iterator.next();
			if (storedEmployee.key.equals(key)) {
				return storedEmployee.employee;
			}
		}

		return null;
	}

	public Employee remove(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
		StoredEmployee storedEmployee = null;
		int index = -1;
		while (iterator.hasNext()) {
			storedEmployee = iterator.next();
			index++;
			if (storedEmployee.key.equals(key)) {
				break;
			}
		}

		if (storedEmployee == null) {
			return null;
		} else {
			// Passing the index by parameter because remove() function
			// from Linked List JDK will iterate all the list again if
			// we pass employee entity.
			hashTable[hashedKey].remove(index);
			return storedEmployee.employee;
		}
	}

	private int hashKey(String key) {
		return Math.abs(key.hashCode() % hashTable.length);
	}

	public void print() {
		for (int i = 0; i < hashTable.length; i++) {
			if(hashTable[i].isEmpty()){
				System.out.println("Position " + i + ": empty.");
			}else{
				System.out.print("Position " + i + ": ");
				ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
				while (iterator.hasNext()) {
					System.out.print(iterator.next().employee);
					System.out.print("->");
				}
				System.out.println("null");
			}
		}
		System.out.println();
	}
}
