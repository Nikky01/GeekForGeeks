package com.geek;

import java.util.HashMap;
import java.util.Scanner;

public class Find_odd_Occurence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
//			int a[]=new int[n];
			int res=0;
			for(int j=0;j<n;j++)
			{
				int temp=sc.nextInt();
//				a[j]=sc.nextInt();
				res=res^temp;
			}
			System.out.println(res);
		}
	}

//	private static int getOccurence(int n, int[] a) {
		// TODO Auto-generated method stub
//		HashMap<Integer,Integer> hh=new HashMap<Integer,Integer>();
//		for(int i=0;i<n;i++)
//		{
//			if(hh.containsKey(a[i]))
//			{
//				int val=hh.get(a[i]);
//				hh.put(a[i], val+1);
//			}
//			else
//				hh.put(a[i],1);
//		}
//		for(Integer k:hh.keySet())
//		{
//			if(hh.get(k)%2!=0)
//				return k;
//		}
//		return -1;
		
//		int res=0;
//		for(int i=0;i<n;i++)
//		{
//			res=res^a[i];
//		}
//		return res;
//	}

}
