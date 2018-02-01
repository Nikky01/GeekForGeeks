package com.geek.adobe;

import java.util.Scanner;

public class SearchKarray {
	private static Scanner sc;

	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int r=sc.nextInt();
			int a[]=new int[r];
			for(int j=0;j<r;j++)
			{
				a[j]=sc.nextInt();
			}
			int k=sc.nextInt();
			System.out.println(searchk(a,k));
		}
	}

	private static int searchk(int[] a, int k) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				return i;
			}
		}
		return -1;
		
	}
	
}
