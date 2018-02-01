package com.geek;

import java.util.Scanner;

public class First_Last_Occurrence_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int x=sc.nextInt();
			getFandL(a,n,x);
			System.out.println("");
		}
	}

	private static void getFandL(int[] a, int n, int x) {
		// TODO Auto-generated method stub
		boolean b=true;
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				b=false;
				System.out.print((i)+" ");
				break;
			}
		}
		for(int i=n-1;i>=0;i--)
		{
			if(a[i]==x)
			{
				System.out.print((i));
				break;
			}
		}
		if(b)
			System.out.print("-1");
	}

}
