package com.geek;


public class COnvertBTtoDLL {
	public static void main(String ar[])
			{
				BinaryTree tree =new BinaryTree();
				tree.root=new Node(5);
				 tree.root.left = new Node(3);
				tree.root.right = new Node(6);
		        tree.root.left.right = new Node(4);
		        tree.root.left.left = new Node(1);
		        tree.root.right.right = new Node(8);
		        tree.root.left.left.right = new Node(2);
		        tree.root.left.left.left = new Node(0);
		        tree.root.right.right.left = new Node(7);
		        tree.root.right.right.right = new Node(9);
		        
		        tree.BttoDll(tree.root);
		        tree.printList(tree.head);
			}
	
}
class Node{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
	
}
class BinaryTree
{
	Node root;
	Node head;
	void BttoDll(Node root)
	{
		if(root==null)
			return;
		BttoDll(root.right);
		root.right=head;
		if(head!=null)
		{
			head.left=root;
		}
		head=root;
		BttoDll(root.left);
	}
	void printList(Node head)
	{
		while (head!=null)
		{
			System.out.print(head.data+" ");
			head=head.right;
		}
	}
}