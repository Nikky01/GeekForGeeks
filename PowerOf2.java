package com.geek.adobe;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			long t=Long.parseUnsignedLong(sc.next());
			isPower2(t);
		}
	}

	private static void isPower2(long x) {
		// TODO Auto-generated method stub
//		  return x!=0 && ((x&(x-1)) == 0);
		if(x!=0 && ((x&(x-1)) == 0))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
