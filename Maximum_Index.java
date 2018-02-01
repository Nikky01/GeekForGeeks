package com.geek;

import java.util.HashMap;
import java.util.Scanner;

public class Maximum_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
				
			}
			getMaxIndex(a,n);
		}
	}

	private static void getMaxIndex(int[] a, int n) {
		// TODO Auto-generated method stub
	
//		int diff=-1;
//		for(int i=0;i<n;i++)
//		{
//		
//			for(int j=n-1;j>i;j--)
//			{
//				int temp=j-i;
//				if(a[j]>a[i]&&temp>diff)
//				{
////					System.out.println("fjsj");
//					
//					
//							diff=temp;
//					
//				}
//			}
//		}
//		System.out.println(diff);
		
			int[] rMax=new int[n];
			int[] lMin=new int[n];
			lMin[0]=a[0];
			for(int i=1;i<n;i++)
				lMin[i]=Math.min(a[i], lMin[i-1]);
			rMax[n-1]=a[n-1];
			for(int i=n-2;i>=0;i--)
				rMax[i]=Math.max(a[i], rMax[i+1]);
			int i=0,j=0;
			int maxDiff=-1;
			while( i<n&& j<n)
			{
				if(lMin[i]<=rMax[j])
				{
					maxDiff=Math.max(maxDiff, j-i);
					j=j+1;
				}
				else
					i=i+1;
			}
			System.out.println(maxDiff);
	}

}
