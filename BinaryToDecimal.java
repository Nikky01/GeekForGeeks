package com.geek.adobe;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			System.out.println(Integer.parseInt(s, 2));
		}
	}

}
