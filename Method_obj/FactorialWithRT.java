package com.basicprograms.Method_obj;

public class FactorialWithRT {

	public static void main(String[] args)
	{
		Hi hi=new Hi();
		System.out.println(hi.Factorial());

	}

}
class Hi
{
	int Factorial()
	{
		int num=5,factorial=1;
		for(int start=1;start<=num;start++)
		{
			factorial=factorial*start;
		}
		return factorial;
	}
}
