package com.geek.adobe;

import java.util.Scanner;

public class PairsDifferenceK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int s=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			System.out.println(getDiffK(n,s,a));
		}
	}

	private static int getDiffK(int n, int s, int[] a) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(a[i]-a[j])==s)
				{
					count++;
				}
			}
		}
		return count;
	}

}
