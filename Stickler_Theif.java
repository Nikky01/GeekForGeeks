package com.geek;

import java.util.Scanner;

public class Stickler_Theif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println(getMax(a,n));
		}
	}

	private static int getMax(int[] a, int n) {
		// TODO Auto-generated method stub
		int include=a[0];
		 int exclude=0;
		 int exclude_new;
		for(int i=1;i<n;i++)
		{
		 exclude_new=Math.max(include, exclude);
		 include=exclude+a[i];
		 exclude=exclude_new;
		}
		return Math.max(include,exclude);
	}

}
