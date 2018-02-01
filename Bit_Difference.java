package com.geek;

import java.util.Scanner;

public class Bit_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int m=sc.nextInt();
			int n=sc.nextInt();
			System.out.println(getBitsDiff(m^n));
		}
	}

	private static int getBitsDiff(int i) {
		// TODO Auto-generated method stub
		int count=0;
		while(i>0)
		{
			i&=(i-1);
			count++;
		}
		return count;
	}

}
