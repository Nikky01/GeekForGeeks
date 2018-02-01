package com.geek;

import java.util.Scanner;

public class InterastingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			getPattern(n);
		}
	}

	private static void getPattern(int n) {
		// TODO Auto-generated method stub
		int count=n;
		for(int i=1;i<2*n;i++)
		{
			count=n;
			for(int j=1;j<2*n;j++)
			{
				if(count>0)
				{
					System.out.print(i);
					count--;
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
