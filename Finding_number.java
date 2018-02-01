package com.geek.adobe;

import java.util.Scanner;

public class Finding_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc =new Scanner(System.in);
				int t=sc.nextInt();
				for(int j=0;j<t;j++)
				{
					int n=sc.nextInt();
					int k=sc.nextInt();
					int l=-1;
					int a[]=new int[n];
					for(int i=0;i<n;i++)
					{
						a[i]=sc.nextInt();
						if(a[i]==k)
						{
							l=i;
						}
					}
					if(l!=-1)
					System.out.println(l);
					else
						System.out.println("OOPS! NOT FOUND");
				}
	}

}
