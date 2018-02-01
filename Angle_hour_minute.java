package com.geek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Angle_hour_minute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			float h=sc.nextFloat();
			float m=sc.nextFloat();
			System.out.println(getAngle(h,m));
		}
	}

	private static int getAngle(float h, float m) {
		// TODO Auto-generated method stub
		if(h>12||h<0||m<0||m>60)
		{
			System.out.println("Wrong Input");
		}
		if(h==12)
			h=0;
		if(m==60)
			m=0;
		double hour_angle=(0.5*(h*60+m));
		double minute_angle=m*6;
		double angle=Math.abs(hour_angle-minute_angle);
		angle=Math.min(360-angle, angle);
		return (int)Math.floor(angle);
	}

}
