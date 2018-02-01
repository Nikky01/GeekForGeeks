package com.geek.adobe;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int t=sc.nextInt();
			System.out.println(palinD(t));
		}
	}

	private static String palinD(int t) {
		// TODO Auto-generated method stub
		int reverse=0;
		int p=t;
		while(p!=0)
		{
			int rem=p%10;
			reverse=reverse*10+rem;
			p=p/10;
		}
		if(reverse==t)
		return "Yes";
		else
			return "No";
//		String s=Integer.toString(t);
//		StringBuilder sb = new StringBuilder(s);
//		if( s.equals(sb.reverse().toString()))
//			return "Yes";
//		else 
//			return "No";
	}

}
