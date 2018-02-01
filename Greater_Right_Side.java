package com.geek;

import java.util.Scanner;

public class Greater_Right_Side {

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
			getGreaterSide(a,n);
			System.out.println();
			t--;
		}
	}

	private static void getGreaterSide(int[] a, int n) {
		// TODO Auto-generated method stub
		
		int max=a[n-1];
		a[n-1]=-1;
		for(int i=n-2;i>=0;i--)
		{
			int temp=a[i];
			a[i]=max;
			if(max<temp)
				max=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

//	private static void getGreaterSide(int[] a, int n) {
//		// TODO Auto-generated method stub
//		for(int i=0;i<n-1;i++)
//		{
//			int max=a[i+1];
//			for(int j=i+1;j<n;j++)
//			{
//				if(max<a[j])
//					max=a[j];
//			}
//			System.out.print(max+" ");
//			
//		}
//		System.out.print("-1");
//		
//	}

}
