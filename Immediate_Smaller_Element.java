package com.geek;

import java.util.Scanner;

public class Immediate_Smaller_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			
			}
			
			for(int i=1;i<n;i++)
			{
				if(a[i]<a[i-1])
					System.out.print(a[i]+" ");
				else
					System.out.print("-1 ");
			}
			System.out.println("-1");
		}
	}

}
