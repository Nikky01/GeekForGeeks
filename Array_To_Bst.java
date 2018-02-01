package com.geek;

import java.util.Scanner;

public class Array_To_Bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			Node3 root=getBst(a,0,n-1);
			preOrder(root);
			
		}
	}

	private static Node3 getBst(int[] a, int start, int end) {
		
		
		if(start>end)		
		return null;
		
		 int mid=(start+end)/2;
		 Node3 node=new Node3(a[mid]);
		 node.left=getBst(a, start, mid-1);
		 node.right=getBst(a, mid+1, end);
		 return node;
		// TODO Auto-generated method stub
			
	}
	static void preOrder(Node3 node)
	{
		if(node==null)
			return;
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
}


class Node3
{
	int data;
	Node3 left,right;
	
	Node3(int d)
	{
		this.data=d;
		left=right=null;
	}
}