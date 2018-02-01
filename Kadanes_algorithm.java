package com.geek;

import java.util.Scanner;

public class Kadanes_algorithm {

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
					System.out.println(getContigeousSum(a,n));
				}
	}

	private static int getContigeousSum(int[] a, int n) {
		// TODO Auto-generated method stub
		int sum=0,total=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			if(total<sum)
			{
				
					total=sum;
			}
			if(sum<0)
				sum=0;
		}
		return total;
	}
}
