package com.geek;

import java.util.Scanner;

public class Maximum_Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			System.out.print(getMaxMoney(m,n));
		}
	}

	private static int getMaxMoney(int m, int n) {
		// TODO Auto-generated method stub
		int sum=0;
		if(n%2==0)
		{
			sum=n/2*m;
		}
		else
			sum=(n+1)/2*m;
		return sum;
	}

}
