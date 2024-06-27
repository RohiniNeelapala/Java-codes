package com.basicprograms.practice;

public class ForEach {

	public static void main(String[] args)
	{
		int a[]= {1,2,4,76,8,9};
		int sum=0,pro=1,count=0;
		for(int temp:a)
		{
			sum=sum+temp;
			pro=pro*temp;
			count++;
		}
        System.out.println(sum);
        System.out.println(pro);
        System.out.println(count);
	}

}
