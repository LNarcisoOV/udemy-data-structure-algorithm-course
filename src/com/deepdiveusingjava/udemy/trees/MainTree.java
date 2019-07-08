package com.deepdiveusingjava.udemy.trees;

public class MainTree {
	public static void main(String args[]) {
		System.out.println("::::: TREE ::::: \n");
		System.out.println("");
		System.out.println("- Hierarchical data structure.");
		System.out.println("- Each field in the tree is called 'Node'.");
		System.out.println("- Each node can have a lot of children, but each child ");
		System.out.println("can have one, and only one parent.");
		System.out.println("- The first node of the tree is called 'ROOT' and it doesn't");
		System.out.println("have a parent.");
		System.out.println("- Every tree can have one and only one root node.");
		System.out.println("- Trees are ideal when things contain things or when things");
		System.out.println("descend from other things.");
		System.out.println("- Java class hierarchy is an example of a tree.");
		System.out.println("- A node without children is called 'leaf node'.");
		System.out.println("- If a tree has only one node, is called a singleton tree, because");
		System.out.println("this tree has only the root node.");
		System.out.println("- Every node with descendants(children) is called Subtree.");
		System.out.println("");
		System.out.println("::::: BINARY TREE ::::: ");
		System.out.println("- Every node has 0, 1 or 2 children, more than this isn't a binary tree.");
		System.out.println("- Children are referred to as left child and right child.");
		System.out.println("- Binary search trees. ");
		System.out.println("- Can perform insertions, deletions, and retrievals in O(logN) time. ");
		System.out.println("- The left child always has a smaller value than its parent.");
		System.out.println("- The right child always has a larger value than its parent.");
		System.out.println("- This means, everythinh left to the root is less than the value of the root, ");
		System.out.println("and everything right to the root is greater than the value of the root, because");
		System.out.println("of that, we can do a binary search.");
		System.out.println("");
		
		
		
	}
}
