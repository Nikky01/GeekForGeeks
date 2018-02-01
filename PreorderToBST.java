package com.geek.adobe;

import java.util.Scanner;
import java.util.Stack;

public class PreorderToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreorderToBST bst=new PreorderToBST ();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
				
			}
			if(isPreToBST(a,n))
				System.out.println("1");
			else
				System.out.println("0");
		}
	}

	private static boolean isPreToBST(int[] a, int n) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		int root=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]<root)
				return false;
			while(!s.empty()&&s.peek()<a[i])
			{
				root=s.peek();
				s.pop();
			}
			s.push(a[i]);
		}
		return true;
	}

}
