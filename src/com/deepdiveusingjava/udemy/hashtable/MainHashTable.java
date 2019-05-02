package com.deepdiveusingjava.udemy.hashtable;

import java.util.HashMap;
import java.util.Map;

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
		creatingPopulatingAndWorkingWithJDKHashTable();
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

		System.out.println("Retrieve key Smith: " + ht.get("Smith"));
		System.out.println();
		System.out.println();
	}

	private static void creatingPopulatingAndWorkingWithJDKHashTable() {
		System.out.println("::: JDK HASH TABLE :::");
		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
		Employee billEnd = new Employee(78, "Bill", "End");

		Map<String, Employee> hashMap = new HashMap<String, Employee>();
		System.out.println("Adding employees:");
		hashMap.put("Jones", janeJones);
		hashMap.put("Doe", johnDoe);
		hashMap.put("Smith", marySmith);
		hashMap.put("Wilson", mikeWilson);
		hashMap.put("End", billEnd);
		hashMap.forEach((k,v) -> System.out.println("Key: '" + k + "', "+ v));
		System.out.println("*See that the order is different of we add.");
		
		System.out.println();
		System.out.println("Checking if we have employees by key:");
		System.out.println("Contains key 'Jones': " + hashMap.containsKey("Jones"));
		System.out.println("Contains key 'Narciso': " + hashMap.containsKey("Narciso"));
		System.out.println("Contains Value 'John Doe': " + hashMap.containsValue(johnDoe));
		System.out.println("*containsValue() is slower than containsKey(), because ");
		System.out.println("contains key will pass the key and will find ");
		System.out.println("faster by the key and containsValue() will traverse ");
		System.out.println("all the list until find the value.");
		
		System.out.println();
		System.out.println("Getting employees:");
		System.out.println("Retrieve key 'Jones': " + hashMap.get("Jones"));
		System.out.println("Retrieve key 'Smith': " + hashMap.get("Smith"));

		System.out.println();
		System.out.println("Removing employees Wilson and Jones:");
		hashMap.remove("Wilson");
		hashMap.remove("Jones");
		hashMap.forEach((k,v) -> System.out.println("Key: '" + k + "', "+ v));
		
		System.out.println();
		hashMap.put("Jones", billEnd);
		System.out.println("If we add another employee with put(), with ");
		System.out.println("a key that already being used, the old employee will ");
		System.out.println("be replaced. ");
		System.out.println("Adding 'Bill End' with the key 'Jones': ");
		hashMap.forEach((k,v) -> System.out.println("Key: '" + k + "', "+ v));
		
		System.out.println();
		hashMap.putIfAbsent("Jones", johnDoe);
		System.out.println("If we add another employee with putIfAbsent(), ");
		System.out.println("it'll add this employee only if the key ");
		System.out.println("isn't been used. ");
		System.out.println("Adding 'John Doe' to 'Jones' key: ");
		hashMap.forEach((k,v) -> System.out.println("Key: '" + k + "', "+ v));
		
		System.out.println();
		System.out.println("Example of getOrDefaul() method, trying to get 'Narciso' key");
		System.out.println("and will return 'John Doe' if it doesn't find 'Narciso':");
		System.out.println(hashMap.getOrDefault("Narciso", johnDoe));
	}
}
