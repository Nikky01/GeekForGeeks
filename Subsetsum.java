package com.geek.adobe;

import java.util.Scanner;

public class Subsetsum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int r=sc.nextInt();
			int a[]=new int[r];
			for(int j=0;j<r;j++)
			{
				a[j]=sc.nextInt();
			}
			if(getsubset(a,r))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private static boolean getsubset(int[] a,int r) {
		
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<r;i++)
		{
			sum+=a[i];
		}
		if(sum%2!=0)
		return false;
		
			return isSubset(a,r,sum/2);
	}

	private static boolean isSubset(int[] a, int r, int sum) {
		// TODO Auto-generated method stub
		if(sum==0)
			return true;
		if(r==0&&sum!=0)
			return false;
		if(a[r-1]>sum)
			return isSubset(a,r-1,sum);
		
		return isSubset(a,r-1,sum)||isSubset(a,r-1,sum-a[r-1]);
	}
	

}
