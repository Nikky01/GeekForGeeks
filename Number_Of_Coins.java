package com.geek;

import java.util.Scanner;

public class Number_Of_Coins {

	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int v=sc.nextInt();
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println(getMinNOCoins(a,n,v));
			t--;
		}
	}

	private static int  getMinNOCoins(int[] a, int n, int v) {
		// TODO Auto-generated method stub
//		int res=Integer.MAX_VALUE;
		
		int sub[]=new int[v+1];
		sub[0]=0;
		for(int i=1;i<=v;i++ )
		{
			sub[i]=Integer.MAX_VALUE;
		}
		
		
			for(int i=1;i<=v;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[j]<=i)
					{
						int  sub_res=sub[i-a[j]];
						if(sub_res !=Integer.MAX_VALUE&&sub_res+1<sub[i])
							sub[i]=sub_res+1;
					}
				}
			}
		
		return sub[v];
			
		
	}
	
	
}
