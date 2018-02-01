package com.geek;

import java.util.Scanner;

public class Sum_increasing_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int t=sc.nextInt();
				for(int i=0;i<t;i++)
				{
					int n=sc.nextInt();
					int a[]=new int[n];
					for(int j=0;j<n;j++)
						a[j]=sc.nextInt();
					System.out.println(getSubsequence(n,a));
				}

	}

	private static int getSubsequence(int n, int[] a) {
		// TODO Auto-generated method stub
		int[] max=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
			max[i]=a[i];
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]>a[j]&&max[i]<max[j]+a[i])
				{
					max[i]=max[j]+a[i];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(max[i]>sum)
				sum=max[i];
		}
		return sum;
	}

}
