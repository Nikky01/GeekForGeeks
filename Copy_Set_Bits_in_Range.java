package com.geek.adobe;

import java.util.Scanner;

public class Copy_Set_Bits_in_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int x=sc.nextInt();;
			int l=sc.nextInt();
			int r=sc.nextInt();
			int y=sc.nextInt();
		getValue(x,l,r,y);
		}
	
		
	}

	private static void getValue(int x, int l, int r, int y) {


		for( int i=l-1;i<r  ;i++)
		{
			
			int temp=y&(1<<i);
			x=x|temp;
			
		}
		System.out.println(x);

	}

}
