package com.deepdiveusingjava.udemy.queues;

import java.util.LinkedList;
import java.util.Queue;

import com.deepdiveusingjava.udemy.model.Employee;

public class MainQueue {

	public static void main(String[] args) {
		System.out.println("::::: QUEUE :::::");
		System.out.println();

		System.out.println("- Abstract data type.");
		System.out.println("- FIFO, first in first out.");
		System.out.println("- ADD(), also called ENQUEUE, add an item ");
		System.out.println("to the end of the queue.");
		System.out.println("- REMOVE(), also called DEQUEUE, remove an item ");
		System.out.println("at the front of the queue.");
		System.out.println("- PEEK(), get the item at the front of the queue,");
		System.out.println("but don't remove it.");
		System.out.println();
		System.out.println();

		creatingPopulatingAndShowingQueue();

		System.out.println();
		System.out.println();

		creatingPopulatingAndShowingCircularlyQueue();

		System.out.println();
		System.out.println();

		JDKQueue();
	}

	private static void creatingPopulatingAndShowingQueue() {
		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");

		ArrayQueue queue = new ArrayQueue(10);

		queue.enqueue(janeJones);
		queue.enqueue(johnDoe);
		queue.enqueue(marySmith);
		queue.enqueue(mikeWilson);

		System.out.println("----------------------------------------------------------------------");
		System.out.println("ENQUEUE: ");
		queue.print();

		System.out.println("----------------------------------------------------------------------");
		System.out.println("DEQUEUE: ");
		System.out.println(queue.dequeue());

		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("PEEK: ");
		System.out.println(queue.peek());
		System.out.println("----------------------------------------------------------------------");
	}

	private static void creatingPopulatingAndShowingCircularlyQueue() {
		System.out.println("::::: CIRCULARLY QUEUE :::::");
		System.out.println("----------------------------------------------------------------------");

		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");

		CircularlyArrayQueue circularlyQueue = new CircularlyArrayQueue(10);
		circularlyQueue.enqueue(janeJones);
		circularlyQueue.enqueue(johnDoe);
		circularlyQueue.enqueue(marySmith);
		circularlyQueue.enqueue(mikeWilson);
		circularlyQueue.enqueue(janeJones);
		circularlyQueue.enqueue(johnDoe);
		circularlyQueue.enqueue(marySmith);
		circularlyQueue.enqueue(mikeWilson);
		circularlyQueue.enqueue(janeJones);
		circularlyQueue.enqueue(johnDoe);
		circularlyQueue.enqueue(marySmith);
		circularlyQueue.enqueue(mikeWilson);
		circularlyQueue.enqueue(janeJones);
		circularlyQueue.enqueue(johnDoe);
		circularlyQueue.enqueue(marySmith);
		circularlyQueue.enqueue(mikeWilson);
		circularlyQueue.enqueue(janeJones);
		circularlyQueue.enqueue(johnDoe);
		circularlyQueue.enqueue(marySmith);
		circularlyQueue.enqueue(mikeWilson);

		circularlyQueue.print();

	}

	private static void JDKQueue() {
		System.out.println("::::: JDK QUEUE :::::");
		System.out.println("----------------------------------------------------------------------");

		Employee janeJones = new Employee(123, "Jane", "Jones");
		Employee johnDoe = new Employee(4567, "John", "Doe");
		Employee marySmith = new Employee(22, "Mary", "Smith");
		Employee mikeWilson = new Employee(3245, "Mike", "Wilson");

		Queue<Employee> queue = new LinkedList<>();

		queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marySmith);
		queue.add(mikeWilson);

		printJDKQueue(queue);

		System.out.println("----------------------------------------------------------------------");
		System.out.println("DEQUEUE: ");
		System.out.println(queue.remove());

		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("PEEK: ");
		System.out.println(queue.peek());

		System.out.println();
		System.out.println("JDK QUEUE AFTER OPERATIONS: ");
		System.out.println("----------------------------------------------------------------------");
		printJDKQueue(queue);
	}

	public static void printJDKQueue(Queue<Employee> queue) {
		for (Employee employee : queue) {
			System.out.println(employee);
		}
	}
}
