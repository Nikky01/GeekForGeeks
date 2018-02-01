package com.geek.adobe;

import java.util.Scanner;

public class AmountOfWater {

	public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);
				int t=sc.nextInt();
				for(int i=0;i<t;i++)
				{
					int n=sc.nextInt();
					int a[]=new int[n];
					for(int j=0;j<n;j++)
					{
						a[j]=sc.nextInt();
					}
					System.out.println(getAmountWater(a));
				}

	}

	private static int getAmountWater(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		int left[]=new int[n];
		int right[]=new int[n];
		int water =0;
		left[0]=a[0];
		for(int i=1;i<n;i++)
			left[i]=Math.max(left[i-1], a[i]);
		right[n-1]=a[n-1];
		for(int j=n-2;j>=0;j--)
			right[j]=Math.max(right[j+1], a[j]);
		for(int i=0;i<n;i++)
			water +=Math.min(left[i], right[i])-a[i];
		return water;
		
	}

}
