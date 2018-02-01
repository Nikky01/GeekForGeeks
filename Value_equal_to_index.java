package com.geek;

import java.util.Scanner;

public class Value_equal_to_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			boolean b=true;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				if(a[i]==i+1)
				{
					b=false;
					System.out.print(a[i]+" ");
				}
			}
			if(b)
				System.out.print("Not Found");
			System.out.println("");
			
		}
	}

}
