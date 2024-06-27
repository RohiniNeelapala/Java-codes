package com.basicprograms.practice;

public class NewArray {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30};
		int b[]= {40,50,60};
		int c[]=new int[a.length+b.length];
		int d[]=new int[a.length+b.length];
		for(int x=0;x<a.length;x++)
		{
			c[x]=a[x];
		}
		int temp=a.length;
		for(int x=0;x<b.length;x++,temp++)
		{
			c[temp]=b[x];
		}
        for(int x=0;x<c.length;x++)
        {
        	System.out.println(c[x]);
        }
        int temp1=0;
        for(int x=a.length-1;x>=0;x--,temp1++)
        {
        	d[temp1]=a[x];
        }
        
        for(int x=b.length-1;x>=0;x--,temp1++)
        {
        	d[temp1]=b[x];
        }
        for(int x=0;x<d.length;x++)
        {
        	System.out.println(d[x]);
        }
	}

}
