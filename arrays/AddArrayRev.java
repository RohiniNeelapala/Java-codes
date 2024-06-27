package com.basicprograms.arrays;

public class AddArrayRev 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30};
		int b[]=new int[] {40,50,60};
		int c[]=new int[a.length+b.length];
		int temp=0;
		for(int x=a.length-1;x>=0;x--,temp++)//x=2 0//x=1 1//x=0 2//3
		{
			c[temp]=a[x];//c[0]=30//c[1]=20//c[2]=10
			
		}
		for(int x=b.length-1;x>=0;x--,temp++)//x=2 3//x=1 4//x=0 5
		{
			c[temp]=b[x];//c[3]=60//c[4]=50 //c[5]=40
			
		}
		for(int x=0;x<c.length;x++)
		{
			System.out.print(c[x]+"  ");
		}

	
		

	}

}
