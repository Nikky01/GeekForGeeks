package com.geek.adobe;

import java.util.Arrays;
import java.util.Scanner;

public class Next_Greater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			String n=sc.next();
			getNextGrtNumber(n);
			System.out.println("");
		}
	}

	private static void getNextGrtNumber(String n) {
		// TODO Auto-generated method stub
		char[] c=n.toCharArray();
		int i;
		for( i=c.length-1;i>0;i--)
		{
			if(c[i]>c[i-1])
			{
				break;
			}
		}
		if(i==0)
		{
			System.out.println("Not Possible");
		}
		else
		{
			int x=c[i-1];
			int min =i;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[j]>x&&c[j]<c[min])
				{
					min=j;
				}
			}
			char t=c[i-1];
			c[i-1]=c[min];
			c[min]=t;
			
			Arrays.sort(c, i, c.length);
			for(char g:c)
				System.out.print(g);
			System.out.println("");
		}
		
	}

}
