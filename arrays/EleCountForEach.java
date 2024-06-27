package com.basicprograms.arrays;

public class EleCountForEach 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5,6};
		int count=0;
		for(int temp:a)
		{
			count++;
		}
        System.out.println(count);
	}

}
