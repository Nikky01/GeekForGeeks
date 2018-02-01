package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Klargest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			int l=sc.nextInt();
			int m=sc.nextInt();
			int[]b=new int[l];
			for(int j=0;j<l;j++)
			{
				b[j]=sc.nextInt();
//				System.out.println(b[i]);
			}
//			System.out.println(b[1]);
			Arrays.sort(b);
			for(int p=l-1;p>l-(m+1);p--)
				System.out.print(b[p]+" ");
			System.out.println("");
		}
		

	}


}
