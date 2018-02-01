package com.geek.adobe;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int s=sc.nextInt();
			double arr[]=new double[s];
			double brr[]=new double[s];
			for(int j=0;j<s;j++)
			{
				arr[j]=sc.nextInt();
				brr[j]=(double) ((a*arr[j]*arr[j])+b*arr[j]+c);
			}
			Arrays.sort(brr);
			for(double k:brr)
				System.out.printf("%.0f ", k);
			System.out.println("");
		}
		

	}

}
