package com.geek;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_to_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(),n,sum;
		for(int tc=0;tc<t;tc++){
		    n=sc.nextInt();sum=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		      a[i]=sc.nextInt();
		    Arrays.sort(a);
		    int i=0,j=n-1,f=0;
		    while(i<j){
		        if(a[i]*a[j]==sum){
		            System.out.println("Yes");
		            f=1;
		            break;
		        }
		        else{
		            if(a[i]*a[j]>sum)
		                j--;
		            else
		                i++;
		        }
		    }
		    if(f==0)
		        System.out.println("No");
		}
	}
	

}
