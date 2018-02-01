package com.geek;

import java.util.Scanner;

public class Minimum_number_of_Jumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[i]=sc.nextInt();
			}
			int res=getMinimum(a,n);
			if(res==Integer.MAX_VALUE)
			{
				System.out.println("-1");
			}
			else
				System.out.println(res);
		}
	}

	private static int getMinimum(int[] a, int n) {
		// TODO Auto-generated method stub
		int jump[]=new int[n];
		if(n==0||a[0]==0)
		{
			return Integer.MAX_VALUE;
		}
		jump[0]=0;
		for(int i=1;i<n;i++)
		{
			jump[i]=Integer.MAX_VALUE;
			for(int j=0;j<i;j++)
			{
				if(i<=j+a[j]&&jump[j]!=Integer.MAX_VALUE)
				{
					jump[i]=Math.min(jump[i], jump[j]+1);
					break;
				}
			}
		}
		return jump[n-1];
	}

}
