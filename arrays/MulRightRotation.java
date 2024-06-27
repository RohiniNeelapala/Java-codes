package com.basicprograms.arrays;

public class MulRightRotation {

	public static void main(String[] args)
	{
		int a[]=new int[] {10,20,30,40,50};
		int x,temp,rotate=3;
		for(int i=1;i<=rotate;i++)
		{
			temp=a[a.length-1];
			for(x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
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
