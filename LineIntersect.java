package com.geek.adobe;
import java.util.*;
import java.lang.*;
import java.io.*;
class LineIntersect
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner s= new Scanner(System.in);
	 int test=s.nextInt();
	 while(test>0){
	     Point p1=new Point(s.nextInt(),s.nextInt());
	     Point p2=new Point(s.nextInt(),s.nextInt());
	     Point p3=new Point(s.nextInt(),s.nextInt());
	     Point p4=new Point(s.nextInt(),s.nextInt());
	     
	    System.out.println(function(p1,p2,p3,p4));
	     test--;
	 }
	 }
	 public static int function(Point p1,Point p2,Point p3,Point p4){
	   int o1=orientation(p1,p2,p3);
	   int o2=orientation(p1,p2,p4);
	   int o3=orientation(p3,p4,p1);
	   int o4=orientation(p3,p4,p2);
	   if(o1!=o2&&o3!=o4)
	   return 1;
	   if(o1==0 && onSegment(p1,p2,p3))
	   return 1;
	   if(o2==0&&onSegment(p1,p2,p4))
	   return 1;
	   if(o3==0&&onSegment(p3,p4,p1))
	   return 1;
	   if(o4==0&&onSegment(p3,p4,p2))
	   return 1;
	   return 0;
	 }
	 public static int orientation(Point p,Point q,Point r){
	     int i=(q.y-p.y)*(r.x-q.x)-(r.y-q.y)*(q.x-p.x);
	     if(i==0)
	     return 0;
	     return i>0?1:2;
	 }
	 public static boolean  onSegment(Point p1,Point p2,Point p3){
	    if(p3.x<=Math.max(p1.x,p2.x) && p3.x>=Math.min(p1.x,p2.x) &&
	    p3.y <= Math.max(p1.y, p2.y) && p3.y>=Math.min(p1.y,p2.y))
	    return true;
	    
	    return false;
	}
	 public static class Point{
	     int x,y;
	     Point(int x,int y){
	         this.x=x;
	         this.y=y;
	     }
	 }
}