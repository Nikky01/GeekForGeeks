package com.geek;

import java.util.Scanner;

public class Unsorted {

		public static void main (String[] args) {
			Scanner in = new Scanner(System.in);
			int testcases = in.nextInt();
			while(testcases-- > 0){
			    int n = in.nextInt();
			    int arr[] = new int[n];
			    for(int i=0;i<n;++i){
			        arr[i] = in.nextInt();
			    }
			    int[] left = new int[n];
			    int[] right = new int[n];
			    left[0] = arr[0];
			    right[n-1] = arr[n-1];
			    for(int i=1;i<n;++i){
			        left[i] = Math.max(arr[i],left[i-1]);
			    }
			    for(int i=n-2;i>=0;i--){
			        right[i] = Math.min(arr[i],right[i+1]);
			    }
			    boolean flag = false;
			    for(int i=1;i<n-1;++i){
			        if((left[i]<= arr[i]) && (right[i] >= arr[i])){
			            flag = true;
			            System.out.println(arr[i]);
			            break;
			        }
			    }
			    if(flag == false){
			        System.out.println(-1);
			    }
			}
		}
	
}
