package com.basicprograms.arrays;

public class SumofArrEleForEach {

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,40};
		int sum=0;
		for(int temp:a)
		{
			sum=sum+temp;
		}
		System.out.println(sum);

	}

}
