package com.geek.adobe;

import java.util.Scanner;

public class SetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				for(int i=0;i<n;i++)
				{
					int counter =0;
					int t=sc.nextInt();
					String s=Integer.toBinaryString(t);
			
					for(int j=0;j<s.length();j++)
					{
						if(s.charAt(j)=='1')
							counter++;
					}
					System.out.println(counter);
				}
	}

}
