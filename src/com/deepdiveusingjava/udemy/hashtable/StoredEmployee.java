package com.deepdiveusingjava.udemy.hashtable;

import com.deepdiveusingjava.udemy.model.Employee;

public class StoredEmployee {
	
	public String key;
	public Employee employee;

	public StoredEmployee(String key, Employee employee) {
		this.key = key;
		this.employee = employee;
	}

}
