package com.geek.adobe;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[0]);
		}
	}

}
