package com.geek;

import java.util.Scanner;

public class Stockspanproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int l=sc.nextInt();
			int a[]=new int[l];
			for(int j=0;j<l;j++)
			{
				a[j]=sc.nextInt();
			}
			sspanprob(a);
			
		}
	}

	private static void sspanprob(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i-1;j>=0;j--)
			{
				if(a[i]>=a[j])
					count++;
				else 
					break;
			}
			System.out.print(count+" ");
		}
	}

}
