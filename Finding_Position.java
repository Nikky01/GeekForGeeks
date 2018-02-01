package com.geek;

import java.util.Scanner;

public class Finding_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		 int n=sc.nextInt();
		 System.out.println(getLastEvenPos(n));
		}
	}

	private static int getLastEvenPos(int n) {
		// TODO Auto-generated method stub
		int res=0;
		for(int i=n;i>0;i--)
		{
			if((i&(i-1))==0)
				{
				res=i;
				break;
				}
		}
		return res;
	}

}
