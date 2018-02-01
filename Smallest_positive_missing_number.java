package com.geek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Smallest_positive_missing_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[i]=sc.nextInt();
				System.out.println(a[i]);
			}
			System.out.println(getSmallestMissing(a,n));
		}
	}

	private static int getSmallestMissing(int[] a, int n) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		Arrays.sort(a);
		System.out.println(Arrays.asList(a));
		int miss=0;
		for(int i=0;i<n;i++)
		{
//			if(a[i]>=0)
//				System.out.println(al.add(a[i])+"uuu"+a[i]);
//			System.out.println(a[i]);
			
		}
		
		miss=al.get(0);
		for(int i:al)
		{
//			System.out.println("TTT"+i+"Miss"+miss);
			if(miss!=i)
				return miss;
			else
				miss+=1;
		}
		return -1;
	}
}
