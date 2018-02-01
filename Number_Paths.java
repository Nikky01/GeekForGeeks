package com.geek;

import java.util.Scanner;

public class Number_Paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int m=1,n=1;
			if(sc.hasNext())
			 {
			m = sc.nextInt();
			 }
		 n=sc.nextInt();
			System.out.println(getPaths(m,n));
			t--;
		}
	}

	private static int getPaths(int m, int n) {
		// TODO Auto-generated method stub
		if(m==1||n==1)
			return 1;
		return getPaths(m-1, n)+getPaths(m, n-1);
//		int a[][]=new int[m][n];
//		for(int i=0;i<m;i++)
//		{
//			a[i][0]=1;
//		}
//		for(int i=0;i<n;i++)
//		{
//			a[0][i]=1;
//		}
//		for(int i=1;i<m;i++)
//		{
//			for(int j=1;j<n;j++)
//			{
//				a[i][j]=a[i-1][j]+a[i][j-1];
//			}
//		}
//		return a[m-1][n-1];
	}

}
