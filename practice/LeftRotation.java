package com.basicprograms.practice;

public class LeftRotation {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50};
		int temp=a[0];
		for(int x=0;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		a[a.length-1]=temp;
		for(int t:a)
		{
			System.out.println(t);
		}
		System.out.println("________");
		int b[]= {10,20,30,40,50};
		int temp1=b[b.length-1],x;
		for(x=b.length-1;x>0;x--)
		{
			b[x]=b[x-1];
		}
		b[0]=temp1;
		for(int t:b)
		{
			System.out.println(t);
		}
		
	}

}
