package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class median_two_sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[2*n];
			for(int i=0;i<2*n;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
		 System.out.println((a[n]+a[n-1]));
		}
	}

}
