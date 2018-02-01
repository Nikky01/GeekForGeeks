package com.geek;

import java.util.Scanner;

public class Non_Repeating_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int length=sc.nextInt();
			String s=sc.next();
		System.out.println(getChar(s.toCharArray(),s.length()));
		}
	}

	private static String getChar(char[] charArray, int length) {
		int count=0;
		for(int i=0;i<length;i++)
		{
			count=0;
			for(int j=0;j<length;j++)
			{
				if(charArray[i]==charArray[j])
				count++;
			}
			if(count<=1)
				return String.valueOf(charArray[i]);
		}
		return  "-1";
		
	}

}
