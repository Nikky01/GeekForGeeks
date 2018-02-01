package com.geek;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Find_all_pairs_given_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int x=sc.nextInt();
			int[] a=new int[n];
			HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			for(int i=0;i<m;i++)
			{
				hs.put(sc.nextInt(), 0);
			
			}
		
			getPairs(hs,n,a,m,x);
			t--;
		}
	}

	private static void getPairs(HashMap<Integer, Integer> hs, int n, int[] a, int m, int x) {
		// TODO Auto-generated method stub
		int count=0;
		TreeMap<Integer,Integer> tt=new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
		if(hs.containsKey(x-a[i]))
		{
//			if(count>0)
//				System.out.print(", ");
//			count++;
			tt.put(a[i], (x-a[i]));
			
		}
		}
		for(Integer i:tt.keySet())
		{
			if(count>0)
				System.out.print(", ");
			count++;
			System.out.print(i+" "+tt.get(i));
			
		}
		if(count==0)
			System.out.println("-1");
		else
			System.out.println("");
		}

}
