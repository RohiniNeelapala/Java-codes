package com.basicprograms.Method_obj;

public class PrimewithRT {

	public static void main(String[] args) 
	{
		Abc abc=new Abc();
		System.out.println(abc.primeornot());

	}

}
class Abc
{
	int num=11;
    String primeornot()
    {
    	int count=0;
    	for(int start=1;start<=num/2;start++)
    	{
    		if(num%start==0)
    		{
    			count++;
    		}
    	}
    	if(count==1)
    	{
    		return num+" prime";
    	}
    	else
    	{
    		return num+" not a prime";
    	}
    }
}
