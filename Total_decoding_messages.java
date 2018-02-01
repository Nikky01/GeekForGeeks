package com.geek;

import java.util.Scanner;

public class Total_decoding_messages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int j=sc.nextInt();
			String n=sc.next();
			System.out.println(getDecodedMsg(n.toCharArray(),j));
		}

	}

	private static int getDecodedMsg(char[] c, int n) {
		// TODO Auto-generated method stub
		int count=0;
		if(c[0]=='0')
		{
			return 0;
		}
		if(n==0||n==1)
			return 1;
		if(c[n-1]>'0')
			count=getDecodedMsg(c,n-1);
//		else
//			return 0;
		if(c[n-2]=='1'||(c[n-2]=='2'&&c[n-1]<'7'))
			count+=getDecodedMsg(c,n-2);
		return count;
		
	}

}
