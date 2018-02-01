package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Pythagorean_Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int [n];
			for(int j=0;j<n;j++)
			{
				int temp=sc.nextInt();
				a[j]=temp*temp;
			}
			System.out.println(getPytTrip(a,n));
		}
	}

	private static String getPytTrip(int[] a, int n) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		for(int i=n-1;i>=2;i--)
		{
			int l=0;
			int r=i-1;
			while(l<r)
			{
				if(a[l]+a[r]==a[i])
					return "Yes";
				if(a[l]+a[r]>a[i])
					r--;
				else
					l++;
			}
		}
		return "No";
		
	}

}
