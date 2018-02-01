package com.geek;

import java.util.Scanner;

public class Count_Total_Set_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			System.out.println(getBitsCount(n));
		}
	}

	private static int getBitsCount(int n) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=n;i++)
		{
			
			count+=getBits(i);
		}
		return count;
	}

	private static int getBits(int i) {
		// TODO Auto-generated method stub
		if(i<=0)
			return 0;
		return (i%2==0?0:1)+getBits(i/2);
	}

}
