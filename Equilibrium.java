package com.geek.adobe;

import java.util.Scanner;

public class Equilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println(findEqui(a,n));
		}
	}

	private static int findEqui(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			int left=0,right=0;
			for(int j=0;j<n;j++)
			{
				if(j<i)
				{
					left=left+a[j];
				}
				if(j>i)
				{
					right=right+a[j];
				}
			}
			if(right==left)
				return i+1;
			
		}
		return -1;
	}

}
