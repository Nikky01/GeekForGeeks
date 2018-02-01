package com.geek;

import java.util.LinkedList;
import java.util.Scanner;

public class Word_Boggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int s=sc.nextInt();
			LinkedList<String> st=new LinkedList<String>();
			for(int i=0;i<s;i++)
			st.add(sc.next());
			int m=sc.nextInt();
			int n=sc.nextInt();
			char[][] a=new char[m][n];
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					
				}
			}
			t--;
		}
	}

}
