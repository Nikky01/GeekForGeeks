package com.geek;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock_buy_and_sell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			getStockBuySell(a.length,a);
		}
	}

	private static void getStockBuySell(int n, int[] a) {
		// TODO Auto-generated method stub
		ArrayList<Interval> sol=new ArrayList<Interval>();
		if(n==1)
			return;
		int count=0;
		int i=0;
		while(i<n-1)
		{
			while((i<n-1)&&(a[i+1]<=a[i]))
				i++;
			if(i==n-1)
				break;
			Interval e=new Interval();
			e.buy=i++;
			while(i<n&&a[i-1]<=a[i])
				i++;
			e.sell=i-1;
			sol.add(e);
			
			count++;
		}
		if(count==0)
			System.out.println("No Profit");
		else
		{
			for(int j=0;j<count;j++)
				System.out.print("("+sol.get(j).buy+" "+sol.get(j).sell+") ");
			System.out.println("");
		}
				
	
	}

}
class Interval
{
	int buy,sell;
}
