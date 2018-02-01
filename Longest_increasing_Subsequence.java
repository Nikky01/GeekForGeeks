package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Longest_increasing_Subsequence {

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
			System.out.println(getCount(a,n));
		}
		
	}

	private static int getCount(int[] a, int n) {
		// TODO Auto-generated method stub
	int lis[]=new int[n];
	int max=0;
	for(int i=0;i<n;i++)
		lis[i]=1;
	for(int i=1;i<n;i++)
		for(int j=0;j<i;j++)
		if(a[i]>a[j]&&lis[i]<lis[j]+1)
			lis[i]=lis[j]+1;
	Arrays.sort(lis);
 return lis[n-1];
}
}