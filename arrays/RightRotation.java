package com.basicprograms.arrays;

public class RightRotation 
{

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50};
		int temp=a[a.length-1];
		for(int x=a.length-1;x>0;x--)
		{
			a[x]=a[x-1];
		}
        a[0]=temp;
        for(int t:a)
        {
        	System.out.print(t+"  ");
        }
	}

}