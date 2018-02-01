package com.geek.adobe;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		  String s=sc.nextLine();
		  reverse(s);
		}
	}

	private static void reverse(String s) {
		// TODO Auto-generated method stub
		String[] st=s.split("\\.");
		int n=st.length;
		for(int i=n-1;i>=0;i--)
		{
			if(i!=0)
				System.out.print(st[i]+".");
			else
				System.out.println(st[i]);
		}
	}


}
