package com.basicprograms.practice;

import java.util.Arrays;

public class New {

	public static void main(String[] args)
	{
		int a[]= {50,30,20,10,0};
		int count=0;
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a.length-1-x;y++)
			{
				count++;
				if(a[y]>a[y+1])
				{
					int t=a[y];
					a[y]=a[y+1];
					a[y+1]=t;
				}
			}
		}
		for(int temp:a)
		{
			System.out.println(temp);
		}
		System.out.println("iter"+ count);
	     
				
				
		
		
	    
	}

}
