package com.geek;

import java.util.Scanner;

public class Knapsack_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int W=sc.nextInt();
			int wt[]=new int[n];
			int v[]=new int[n];
			
			for(int j=0;j<n;j++)
			{
				v[j]=sc.nextInt();
			}
			for(int j=0;j<n;j++)
			{
				wt[j]=sc.nextInt();
			}
			System.out.println(getKnapsack(n,W,wt,v))	;
		}
	}
	 static int max(int a, int b) { return (a > b)? a : b; }

	private static int getKnapsack(int n, int w, int[] wt, int[] v) {
		// TODO Auto-generated method stub
		if(n==0||w==0)
			return 0;
		if(wt[n-1]>w)
			return getKnapsack(n-1, w, wt, v);
		else
			return max(getKnapsack(n-1, w-wt[n-1], wt, v)+v[n-1], getKnapsack(n-1, w, wt, v));
	}

}
