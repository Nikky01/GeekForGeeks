package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Finding_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int a[]=new int [2*n+2];
			for(int i=0;i<2*n+2;i++)
			{
				a[i]=sc.nextInt();
			}
			getNumbers(a,a.length);
			t--;
		}
	}

	private static void getNumbers(int[] a, int l) {
		// TODO Auto-generated method stub
		int sum=a[0];
		int x=0,y=0,set;
		for(int i=1;i<l;i++)
		{
			sum=sum^a[i];
		}
		
		set=sum&~(sum-1);
		for(int i=0;i<l;i++)
		{
			if((a[i] & set)!=0)
				x=x^a[i];
			else
				y=y^a[i];
			
			
		}
		System.out.println(y+" "+x);
//		Arrays.sort(a);
//		for(int i=1;i<l;)
//		{
//			if(a[i]==a[i-1])
//			{
//				i++;
//			}
//			else
//			{
//				System.out.print(a[i]+" ");
////				i=i+2;
//				i++;
//			}
//		}
	}
	

}
