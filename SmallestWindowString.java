package com.geek;

import java.util.Scanner;

public class SmallestWindowString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			String s1=sc.next();
			int sub=0;
			for(int j=0;j<s1.length();j++)
			{
				for(int k=0;k<s.length();k++)
				{
					if(s.charAt(j)==s1.charAt(k))
					{
						if(k>sub)
							sub=k;
						break;
					}
				}
			}
			System.out.println(s.substring(0, sub));
		}
	}
}
