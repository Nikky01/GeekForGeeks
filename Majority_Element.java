package com.geek;

import java.util.HashMap;
import java.util.Scanner;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{			
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			getMajorityelement(a,n);
		}
	}

	private static void getMajorityelement(int[] a, int n) {
		// TODO Auto-generated method stub
		int out=0;boolean b=false;
		HashMap<Integer,Integer> sol=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
		if(sol.containsKey(a[i]))
		{
			int val=sol.get(a[i]);
			sol.put(a[i], val+1);
		}
		else
			sol.put(a[i], 1);
		}
		for(Integer i:sol.keySet())
		{
			if(sol.get(i)>n/2)
			{
				out=i;
				b=true;
				break;
				
			}
		}
	if(b)
		System.out.println(out);
	else
		System.out.println("NO Majority Element");
	}

}
