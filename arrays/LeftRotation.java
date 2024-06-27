package com.basicprograms.arrays;

public class LeftRotation
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		int temp=a[0];//10
		for(int x=0;x<a.length-1;x++)
		{//0 1 2 3 4<4
			a[x]=a[x+1];//a[0]=20 a[1]=30 a[2]=40 a[3]=50
		}
		a[a.length-1]=temp;//a[4]=10
		for(int t:a)
		{
			System.out.print(t+"  ");
		}

	}

}
