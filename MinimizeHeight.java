package com.geek.adobe;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int k=sc.nextInt();
			int t=sc.nextInt();
			int a[]=new int[t];
			for(int j=0;j<t;j++)
			{
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[t-1]-a[0]);
		}
	}

}
