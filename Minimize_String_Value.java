package com.geek;

import java.util.Scanner;

public class Minimize_String_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.nextLine();
			int x=sc.nextInt();
			getMinimizeVAlue(s,x);
		}
	}

	private static void getMinimizeVAlue(String s, int x) {
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		
	}

}
