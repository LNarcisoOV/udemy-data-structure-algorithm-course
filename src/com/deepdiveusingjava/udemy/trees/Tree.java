package com.deepdiveusingjava.udemy.trees;

public class Tree {
	
	private TreeNode root;
	
	public void insert(int value){
		if(root == null){
			root = new TreeNode(value);
		}else{
			root.insert(value);
		}
	}
	
	public void traverseInOrder(){
		if(root != null){
			root.traverseInOrder();
		}
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
}
