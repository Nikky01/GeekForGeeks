package com.geek;

import java.util.Scanner;

public class SlidingWindow {

	 static void printKMax(int arr[], int n, int k) 
	    {
	        int j, max;
	 
	        for (int i = 0; i <= n - k; i++) {
	             
	            max = arr[i];
	 
	            for (j = 1; j < k; j++) 
	            {
	                if (arr[i + j] > max)
	                    max = arr[i + j];
	            }
	            System.out.print(max + " ");
	        }
	    }
	 
	    // Driver method
	    public static void main(String args[]) 
	    {
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	for(int i=0;i<n;i++)
	    	{
	    		int l=sc.nextInt();
	    		int arr[] = new int[l];
	    		for(int j=0;j<l;j++)
	    		{
	    			arr[j]=sc.nextInt();
	    		}
	    		  int k = sc.nextInt();
	  	        printKMax(arr, arr.length, k);
	    	}
	        
	      
	    }

}
