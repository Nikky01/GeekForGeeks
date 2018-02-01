package com.geek;

import java.util.Scanner;

public class TutorialIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		
		int n=sc.nextInt();
		int b[]=new int[n];
		boolean t=true;
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
			if(b[i]==a && t)
			{
				t=false;
				System.out.println(i);
			}
		}
	}

}
