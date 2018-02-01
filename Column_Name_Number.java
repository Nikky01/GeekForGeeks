package com.geek;

import java.util.Scanner;

public class Column_Name_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			getColumnNumber(n);
		}
	}

	private static void getColumnNumber(int n) {
		// TODO Auto-generated method stub
		StringBuffer  st=new StringBuffer();
		while(n>0)
		{
		int r=n%26;
		if(r==0)
		{
//			System.out.println("Z");
			st.append('Z');
			n=n/26-1;
		}
		else
		{
		
			st.append((char)(r+64));
//			System.out.print((char)(r+64));
			n=n/26;
		}
		
		}
		System.out.println(st.reverse());
		
	}

}
