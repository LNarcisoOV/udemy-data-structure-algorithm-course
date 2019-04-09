package com.deepdiveusingjava.recursion;

public class RecursionClass {
	public static void main(String args[]) {
		System.out.println("::::: FACTORIAL EXAMPLE WITH RECURSIVITY ::::: \n");
		
		System.out.println("Factorial zero is always one. ");
		System.out.println("1! = 1 * 0! = 1; ");
		System.out.println("2! = 2 * 1 = 2 * 1! = 2; ");
		System.out.println("3! = 3 * 2 * 1 = 3 * 2! = 6; ");
		System.out.println("4! = 4 * 3 * 2 * 1 = 4 * 3! = 24; ");
		System.out.println("... ");
		System.out.println("\nFormula: ");
		System.out.println("n! = n * (n-1)! ");
		System.out.println();
		
		executeFactorialRecusivity();
	}

	private static void executeFactorialRecusivity() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Factorial of "+ i +" is: " + recursiveFactorial(i));
		}
	}

	public static int recursiveFactorial(int num) {
		if (num == 0) {
			return 1;
		}

		return num * recursiveFactorial(num - 1);
	}

	public static int iterativeFactorial(int num) {
		if (num == 0) {
			return 1;
		}

		int factorial = 1;
		for (int i = 0; i <= num; i++) {
			factorial *= i;
		}

		return factorial;
	}
}
