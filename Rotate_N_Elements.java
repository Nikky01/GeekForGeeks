package com.geek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Rotate_N_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int x=sc.nextInt();
			ArrayList<Integer> ar=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
				ar.add(sc.nextInt());
			Collections.rotate(ar, x+1);
			for(Integer i:ar)
				System.out.print(i+" ");
			System.out.println("");
		}
	}

}
