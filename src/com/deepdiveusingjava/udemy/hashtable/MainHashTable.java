package com.deepdiveusingjava.udemy.hashtable;

import com.deepdiveusingjava.udemy.model.Employee;

public class MainHashTable {

	public static void main(String[] args) {
		System.out.println("::::: HASH TABLE :::::");
		System.out.println();

		System.out.println("- Abstract data type.");
		System.out.println("- Exist to speed retrieval data.");
		System.out.println("- Provide access to data using keys. ");
		System.out.println("- Key don't have to be a n integer.");
		System.out.println("- Consist of a key/value pair - data types don't");
		System.out.println(" have to match.");
		System.out.println("- Optimized retrivial(when you know the key).");
		System.out.println("and return its item.");
		System.out.println("- Associative array is on type of hash table.");
		System.out.println();
		System.out.println("::: HASHING :::");
		System.out.println("- Maps keys of any data type to an integer.");
		System.out.println("- Hash function maps key to int.");
		System.out.println("- In Java, hash function is Object.hashCode().");
		System.out.println("- Collision occurs when more than one value has ");
		System.out.println("the same hashed value.");
		System.out.println("- Store the value at the hashed ky value - this is ");
		System.out.println("the index into the array. ");
		System.out.println();
		System.out.println("::: LOAD FACTOR :::");
		System.out.println("- Tells us how full a hash table is.");
		System.out.println("- LOAD FACTOR = # OF ITEMS / CAPACITY = SIZE / CAPACITY.");
		System.out.println("- Load factor is used to decide when to resize the array ");
		System.out.println("backing the hash table.");
		System.out.println("- Don't want load factor too low(lots of empty space). ");
		System.out.println("- Don't want load factor too high(will increase the ");
		System.out.println("likelihood of collisions).");
		System.out.println("- Can play a role in determining the time complexity");
		System.out.println("for retrieval.");
		System.out.println();
		System.out.println("::: LINEAR PROBING :::");
		System.out.println("- Avoiding the collisions, we'll implement linear probing, ");
		System.out.println("which will search for the next empty slot to add a new item.");
		System.out.println("If the HashTable if full, we can't add the new item.");

		System.out.println();
		System.out.println();

		creatingPopulatingAndWorkingWithHashTable();
		creatingPopulatingAndWorkingWithChainedHashTable();
	}

	private static void creatingPopulatingAndWorkingWithHashTable() {
		System.out.println("::: SIMPLE HASH TABLE :::");
		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
		Employee billEnd = new Employee(78, "Bill", "End");

		SimpleHashTable ht = new SimpleHashTable();
		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Smith", marySmith);
		ht.put("Wilson", mikeWilson);
		ht.put("End", billEnd);
		
		System.out.println("Adding employees:");
		ht.print();
		
		System.out.println("Getting employees:");
		System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
		System.out.println("Retrieve key Smith: " + ht.get("Smith"));
		
		System.out.println();
		System.out.println("Removing employees Wilson and Jones:");
		ht.remove("Wilson");
		ht.remove("Jones");
		ht.print();
		
		System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
		System.out.println();
		System.out.println();
	}
	
	private static void creatingPopulatingAndWorkingWithChainedHashTable() {
		System.out.println("::: CHAINED HASH TABLE :::");
		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
		Employee billEnd = new Employee(78, "Bill", "End");

		ChainedHashTable ht = new ChainedHashTable();
		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Smith", marySmith);
		ht.put("Wilson", mikeWilson);
		ht.put("End", billEnd);
		
		System.out.println("Adding employees:");
		ht.print();
		
		System.out.println("Getting employees:");
		System.out.println("Retrieve key Jones: " + ht.get("Jones"));
		System.out.println("Retrieve key Smith: " + ht.get("Smith"));
		
		System.out.println();
		System.out.println("Removing employees Wilson and Jones:");
		ht.remove("Wilson");
		ht.remove("Jones");
		ht.print();
//		
		System.out.println("Retrieve key Smith: " + ht.get("Smith"));
	}
}
