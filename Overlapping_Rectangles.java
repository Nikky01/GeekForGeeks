package com.geek;

import java.util.Scanner;

public class Overlapping_Rectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			point p1=new point(sc.nextInt(),sc.nextInt());
			point p2=new point(sc.nextInt(),sc.nextInt());
			point p3=new point(sc.nextInt(),sc.nextInt());
			point p4=new point(sc.nextInt(),sc.nextInt());
			System.out.println(isOverlap(p1,p2,p3,p4));
		}
	}

	private static int isOverlap(point p1, point p2, point p3, point p4) {
		// TODO Auto-generated method stub
		if(p1.x>p4.x||p3.x>p2.x)
		return 0;
		if(p1.y<p4.y||p3.y<p2.y)
			return 0;
		return 1;
	}

}
class point
{
	int x;
	int y;
	point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}