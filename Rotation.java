package com.geek;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println(getRotationCount(a,n));
			t--;
		}
	}

	private static int getRotationCount(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
				return i+1;
		}
		return 0;
	}

}
