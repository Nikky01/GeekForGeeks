package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Triplet_sum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int x=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			System.out.println(isTripletSum(a,n,x));
		}
	}

	private static int isTripletSum(int[] a, int n, int x) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		for(int i=0;i<n-2;i++)
		{
			int l=i+1;
			int r=n-1;
			while(l<r)
			{
				if(a[i]+a[l]+a[r]==x)
				{
					return 1;
				}
				else
					if(a[i]+a[l]+a[r]<x)
					{
						l++;
					}
					else
						r--;
			}
		}
		return 0;
	}

}
