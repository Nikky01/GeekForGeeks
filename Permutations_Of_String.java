package com.geek;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Permutations_Of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			String s=sc.next();
			getPermutation(s,0,s.length()-1);
		}
	}

	private static void getPermutation(String s, int l, int n) {
		// TODO Auto-generated method stub
		  LinkedList<String> v = new LinkedList<String>();
		char[] c=s.toCharArray();
		if(l==n)
		{
			v.add(s);
		
		
		}
		else
		for(int i=l;i<=n;i++)
		{
			s=swap(s,l,i);
			getPermutation(s,l+1,n);
			s=swap(s,l,i);
		}
		printString(v);
	
	}

	private static void printString(LinkedList<String> v) {
		// TODO Auto-generated method stub
		Collections.sort(v,new Comparator<String>(){
			public int compare(String s1,String s2)
			{
				return s1.compareTo(s2);
			}
		});
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}
	}

	private static String swap(String s, int l, int i) {
		// TODO Auto-generated method stub
		char c[]=s.toCharArray();
		char temp=c[l];
		c[l]=c[i];
		c[i]=temp;
		return String.valueOf(c);
	}


}
