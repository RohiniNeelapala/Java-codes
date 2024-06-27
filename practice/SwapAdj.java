package com.basicprograms.practice;

public class SwapAdj {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60};
		for(int x=0;x<a.length;x=x+2)
		{
			int temp=a[x];
			a[x]=a[x+1];
			a[x+1]=temp;
		}
		for(int t:a)
		{
			System.out.println(t);
		}

	}

}
