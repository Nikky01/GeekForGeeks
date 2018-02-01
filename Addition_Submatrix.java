package com.geek;

import java.util.Scanner;

public class Addition_Submatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int c[][]=new int[n][m];
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<m;k++)
				{
					c[j][k]=sc.nextInt();
				}
			}
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			System.out.println(getSumSubmatrix(n,m,c,x1,y1,x2,y2));
		}
	}

	private static int getSumSubmatrix(int n, int m, int[][] c, int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=x1-1;i<x2-1;i++ )
		{
			for(int j=y1-1;j<y2-1;j++)
			{
				sum+=c[i][j];
			}
		}
		return sum;
	}

}
