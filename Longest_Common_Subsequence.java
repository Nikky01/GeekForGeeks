package com.geek;

import java.io.*;

class Longest_Common_Subsequence {
    public static int max(int a,int b)
    {
        return Math.max(a,b);
    }
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int x=0;x<t;x++)
		{
		    String s=br.readLine();
		    String rc[]=s.split(" ");
		    int c=Integer.parseInt(rc[0]);
		    int r=Integer.parseInt(rc[1]);
		    String cs=br.readLine();
		    String rs=br.readLine();
		    int ans[][]=new int[r+1][c+1];
		    for(int i=0;i<r+1;i++)
		    {
		        for(int j=0;j<c+1;j++)
		        {
		            if(i==0||j==0)
		            {
		                ans[i][j]=0;
		            }
		            else
		            {
		                if(cs.charAt(j-1)==rs.charAt(i-1))
		                {
		                    ans[i][j]=ans[i-1][j-1]+1;
		                }
		                else
		                {
		                    ans[i][j]=max(ans[i-1][j],ans[i][j-1]);
		                }
		            }
		        }
		    }
		    System.out.println(ans[r][c]);
		    
		}
	}
}