package com.geek;

import java.util.Scanner;

public class Egg_Dropping_Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int e=sc.nextInt();
			int f=sc.nextInt();
			System.out.println(getMinAttampt(e,f));
		}
	}

	private static int getMinAttampt(int e, int f) {
		// TODO Auto-generated method stub
		int a[][]=new int[e+1][f+1];
		int res;
		for(int i=1;i<=e;i++)
		{
			a[i][1]=1;
			a[i][0]=0;
		}
		
		for(int j=1;j<=f;j++)
		{
			a[1][j]=j;
		}
		
		for(int i=2;i<=e;i++)
		{
			for(int j=2;j<=f;j++)
			{
				a[i][j]=Integer.MAX_VALUE;
				for(int x=1;x<=j;x++)
				{
					res=1+Math.max(a[i-1][x-1],a[i][j-x]);
					if(res < a[i][j])
					{
						a[i][j]=res;
					}
				}
			}
		}
		return a[e][f];
	}

}
