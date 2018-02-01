package com.geek;

import java.util.Scanner;

public class Subarray_with_given_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int k=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			getSubarray(a,n,k);
		}
	}

	private static int getSubarray(int[] a, int n, int k) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=a[i];
			for(int j=i+1;j<=n;j++)
			{
				
				if(sum==k)
				{
					System.out.println((i+1)+" "+(j));
					return 1;
				}
				if(sum>k||j==n)
					break;
				sum=sum+a[j];
			}
		}
		return 0;
	}

}
