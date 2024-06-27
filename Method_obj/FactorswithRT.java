package com.basicprograms.Method_obj;

public class FactorswithRT
{

	public static void main(String[] args)
	{
		Myclass myclass=new Myclass();
		int temp=myclass.Factors();
		System.out.println(temp);

	}

}
class Myclass
{
	int num=24;
	int Factors()
	{
		int count=0;
		for(int start=1;start<=num;start++)
		{
			if(num%start==0)
			{
				count++;
				System.out.println(start);
			}
		}
		return count;
	}
}