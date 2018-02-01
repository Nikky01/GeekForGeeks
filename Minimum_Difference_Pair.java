package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Difference_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			System.out.println(getMinPair(a,n));
			t--;
		}

	}

	private static int getMinPair(int[] a, int n) {
		// TODO Auto-generated method stub
		int diff=Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++)
		{
			if(a[i+1]-a[i]<diff)
			{
				diff=a[i+1]-a[i];
			}
		}
		return diff;
	}

}
