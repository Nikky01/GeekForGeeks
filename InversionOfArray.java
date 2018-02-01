package com.geek.adobe;

import java.util.Scanner;

public class InversionOfArray {

	public static void main(String[] args) {

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
		System.out.println(getInversionCount(a));
		}

	}

	private static int  getInversionCount(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
					count++;
			}
		}
		return count;
	}

}
