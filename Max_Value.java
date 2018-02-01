package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n] ;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				b[i]=a[i]-i;
			}
			Arrays.sort(b);
			System.out.println(b[n-1]-b[0]);
		}
	}

}
