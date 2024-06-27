package com.basicprograms.arrays;

public class MulLeftRotation
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,40,50};
		int x,rotate=3,temp;
		for(int i=1;i<=rotate;i++)
		{
			temp=a[0];
			for(x=0;x<a.length-1;x++)
			{
				a[x]=a[x+1];
			}
			a[x]=temp;
			System.out.println("rotation "+i);
			for(int t:a)
			{
				System.out.print(t+"  ");
			}
			System.out.println();
		}

	}

}
