package CollectionsConcept;

public class BTTraversal {

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	public static TreeNode createBinaryTree() {
		TreeNode rootNode = new TreeNode(40);
		TreeNode root20 = new TreeNode(20);
		TreeNode root10 = new TreeNode(10);
		TreeNode root30 = new TreeNode(30);
		TreeNode root60 = new TreeNode(60);
		TreeNode root50 = new TreeNode(50);
		TreeNode root70 = new TreeNode(70);

		rootNode.left = root20;
		rootNode.right = root60;

		root20.left = root10;
		root20.right = root30;

		root60.left = root50;
		root60.right = root70;
		
		return rootNode;
	}

	// pre-order recursive solution
	public void preOrderTraverse(TreeNode root) {

		if (root != null) {
			System.out.println(root.data);
			preOrderTraverse(root.left);
			preOrderTraverse(root.right);
		}

	}
	
	public void inOrderTraverse(TreeNode root) {

		if (root != null) {
			//System.out.println(root.data);
			inOrderTraverse(root.left);
			System.out.println(root.data);
			inOrderTraverse(root.right);
		}

	}
	
	public void postOrderTraverse(TreeNode root) {
		if (root != null) {
			//System.out.println(root.data);
			postOrderTraverse(root.left);
			postOrderTraverse(root.right);
			System.out.println(root.data);	
		}

	}
	

	public static void main(String[] args) {
		
		BTTraversal bt = new BTTraversal();
		TreeNode root = bt.createBinaryTree();
		bt.preOrderTraverse(root);
		System.out.println("<<<<<<<<<<<<>>>>>>>>>>");
		bt.inOrderTraverse(root);
		System.out.println("<<<<<<<<<<<<>>>>>>>>>>");
		bt.postOrderTraverse(root);
		
	}

}
