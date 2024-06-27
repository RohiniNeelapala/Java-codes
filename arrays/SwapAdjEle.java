package com.basicprograms.arrays;

import java.util.Arrays;

public class SwapAdjEle 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,40,50,60};
		for(int x=0;x<a.length;x=x+2)//0//x=0+2//
		{
			int temp=a[x];//temp=10//temp=30//
			a[x]=a[x+1];//a[0]=a[1]=20  a[2]=40
			a[x+1]=temp;//a[1]=10//a[x+1]=a[3]=30
			
		}
		for(int t:a)
		{
			System.out.print(t+"  ");
		} 


	}

}
