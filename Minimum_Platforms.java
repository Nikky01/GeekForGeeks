package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Platforms {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
				
			}
			for(int j=0;j<n;j++)
			{
				b[j]=sc.nextInt();
				
			}
			getMinimum(a,b,n);
		}
	}

	private static void getMinimum(int[] a, int[] b, int n) {
		// TODO Auto-generated method stub
		int i=1,j=0;
		int count=1,result=1;
		Arrays.sort(a);
		Arrays.sort(b);
		while(i<n&&j<n)
		{
			if(a[i]<b[j])
			{
				count++;
				i++;
				if(result<count)
					result=count;
			}
			else
				{
				j++;
				count--;
				}
			
		}
		System.out.println(result);
	}
}
