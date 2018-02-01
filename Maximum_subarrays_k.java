package com.geek;

import java.util.Scanner;

public class Maximum_subarrays_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
				
			}
			getMAxSubarray(a,n,k);
			t--;
		}
	}

	private static void getMAxSubarray(int[] a, int n, int k) {
		// TODO Auto-generated method stub
		int max;
		for(int i=0;i<=n-k;i++)
		{
			 max=a[i];
			for(int j=1;j<k;j++)
			{
				if(a[i+j]>max)
					max=a[i+j];
			}
			System.out.print(max+" ");
		}
	}

}
