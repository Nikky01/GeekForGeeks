package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Wave_array {

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
				getWaveArray(a,n);
		}
	}

	private static void getWaveArray(int[] a, int n) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		for(int i=0;i<n-1;i++)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			i++;
		}
		for(Integer i:a)
		{
			System.out.print(i+" ");
		}
	}

}
