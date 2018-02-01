package com.geek.adobe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StreamMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=0,t=0,j=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			{
			a[i]=sc.nextInt();
			
			j=i;
		      while(j>0 && a[j]<a[j-1]){
		         // System.out.println("comparing for"+j+" "+a[j]+" "+a[j-1]);
		          t=a[j];
		          a[j]=a[j-1];
		          a[j-1]=t;
		          j--;
		      }
			if((i+1)%2==0)
		     {
		         m=(a[i/2]+a[(i+1)/2])/2;
		     }
			else
		     m=a[i/2];
		     System.out.println(m);
			}
		
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		int median=0;
//		for(int i=0;i<t;i++)
//		{
//			al.add(sc.nextInt());
////			if(i==0)
////			{
////				median=al.get(0);
////			}
////			else
////			median=(median+al.get(i))/2;
//			
//			Collections.sort(al);
//			if(i%2==0)
//			{
////				System.out.println(median);
//				System.out.println(((al.get(i/2)+al.get((i+1)/2))/2));
//			}
//			else
//				System.out.println(al.get(i/2));
//				
//		}
	}

}
