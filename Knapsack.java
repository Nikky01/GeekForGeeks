package com.geek;

import java.util.Scanner;

class Knapsack
{
 
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

	private static int getKnapsack(int n, int w, int[] wt, int[] v) {
		// TODO Auto-generated method stub
		int k[][]=new int[n+1][w+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=w;j++)
			{
				if(i==0||j==0)
					k[i][j]=0;
				else
					if(wt[i-1]<=j)
						k[i][j]=Math.max(v[i-1]+k[i-1][j-(wt[i-1])], k[i-1][j]);
					else
						k[i][j]=k[i-1][j];
			}
		}
		return k[n][w];
	}
}