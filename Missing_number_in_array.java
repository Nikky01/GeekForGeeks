package com.geek;

import java.util.Scanner;

public class Missing_number_in_array {

//	static int getMissingNo (int a[], int n)
//    {
//        int i, total;
//        total  = (n+1)*(n+2)/2;   
//        for ( i = 0; i< n; i++)
//           total -= a[i];
//        return total;
//    }
//      
    /* program to test above function */
    public static void main(String args[])
    {Scanner sc =new Scanner(System.in);
	int t=sc.nextInt();
	for(int j=0;j<t;j++)
	{
		int n=sc.nextInt();
		int a[]=new int[n-1];
		for(int i=0;i<n-1;i++)
		{
			a[i]=sc.nextInt();
			
		}
        int miss = getMissingNo(a,a.length);
        System.out.println(miss);   
	}
    }

private static int getMissingNo(int[] a, int length) {
	// TODO Auto-generated method stub
	int i;
	int x1=a[0];
	int x2=1;
	for( i=1;i<length;i++)
		x1=x1^a[i];
	for(i=2;i<=length+1;i++)
		x2=x2^i;
	return (x1^x2);

}
	
	

}
