package com.geek.adobe;

import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
//			int k=sc.nextInt();
			getPascal(n);
		}
	}

	private static void getPascal(int n) {
		// TODO Auto-generated method stub
		int p[][]=new int[n][n];
		for(int line=0;line<n;line++)
		{
			for(int i=0;i<=line;i++)
			{
				if(line==i || i==0)
				{
					p[line][i]=1;
				}
				else
					p[line][i]=p[line-1][i]+p[line-1][i-1];
				
				if(line==n-1)
				{
					System.out.print(p[line][i]+" ");
				}
				
			}
		
		}
	}

}
