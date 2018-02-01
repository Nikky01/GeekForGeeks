package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Elements_Sum_Zero {

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
		sumClosetZero(a,n);
			t--;
		}
	}

	private static void sumClosetZero(int[] a, int n) {
		// TODO Auto-generated method stub
		int sum;
		int min_sum= 999999;
		int left=1,right=n-1;
		Arrays.sort(a);
		int l=0,r=n-1;
		while(l<r)
		{
			sum=a[l]+a[r];
			if(Math.abs(sum)<Math.abs(min_sum))
			{
				min_sum=sum;
				left=l;
				right=r;
			}
			if(sum<0)
				l++;
			else
				r--;
		}
		System.out.println(a[left]+" "+a[right]);
		
	}

}
