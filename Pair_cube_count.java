package com.geek.adobe;

import java.util.Scanner;

public class Pair_cube_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			System.out.println(getPairCube(n));
		}
	}

	private static int getPairCube(int n) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<Math.cbrt(n);i++)
		{
			int cb=i*i*i;
			int diff =n-cb;
			int cdiff=(int) Math.cbrt(diff);
			
			if(cdiff*cdiff*cdiff==diff)
				count++;
		}
		return count;
	}

}
