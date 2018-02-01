package com.geek;

import java.util.Scanner;

public class Trapping_rain_water {

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
			System.out.println(getTrappingWater(a,n));
			t--;
		}
	}

	private static int getTrappingWater(int[] a, int n) {
		// TODO Auto-generated method stub
		
		int right[]=new int[n];
		int left[]=new int[n];
		int water=0;
		left[0]=a[0];
				
				
		for(int i=1;i<n;i++)
		{
			left[i]=Math.max(left[i-1], a[i]);
		}
		
		right[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1], a[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			water+=Math.min(left[i], right[i])-a[i];
		}
		return water;
		
	}

}
