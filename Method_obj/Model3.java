package com.basicprograms.Method_obj;

public class Model3 
{

	public static void main(String[] args) 
	{
		Model3 abc=new Model3();
		for(int x=1;x<=100;x++)
		{
			if(abc.even(x)==0)
				System.out.println(x);
		}
		for(int x=1;x<=100;x++)
		{
			if(abc.factors(x)==2)
				System.out.println(x);
		}

	}
	int even(int x)
	{
		return x%2;
	}
	int factors(int x)
	{
		int count=0;
		for(int start=1;start<=x;start++)
		{
			if(x%start==0)
				count++;
		}
		return count;
	}

}
