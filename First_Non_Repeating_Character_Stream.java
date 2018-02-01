package com.geek;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.Scanner;

public class First_Non_Repeating_Character_Stream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		Reader reader = new InputStreamReader(System.in);
	
		
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
//			char[] c=new char[n];
	
				String s= sc.nextLine();
			
				    String[] c= s.split(" ");
			getFirstNRC(c,n);
			System.out.println("");
		}
	}

	private static void getFirstNRC(String[] c, int n) {
		// TODO Auto-generated method stub
		int MAX_CHAR=256;
		LinkedList<Character> ll=new LinkedList<Character>();
		
		boolean[] b=new boolean[MAX_CHAR];
		for(int i=0;i<c.length;i++)
		{
			char c1=c[i].charAt(0);
			if(!b[c1])
			{
				if(!ll.contains(c1))
				{
					ll.add(c1);
				}
				else
				{
					ll.remove(c1);
					b[c1]=true;
				}
				
			}
			if(ll.size()!=0)
			System.out.print(ll.get(0)+" ");
			else
				System.out.print("-1 ");
		}
		
	}

}
