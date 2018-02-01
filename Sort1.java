package com.geek.adobe;

import java.util.Arrays;
import java.util.Scanner;

public class Sort1 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int r=sc.nextInt();
			int a[]=new int[r];
			for(int j=0;j<r;j++)
			{
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);
			for(Integer b:a)
			{
				System.out.print(Arrays.toString(a)+" ");
			}
			System.out.println();
		}
		
	}
}
