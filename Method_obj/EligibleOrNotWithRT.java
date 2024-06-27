package com.basicprograms.Method_obj;

public class EligibleOrNotWithRT 
{
    int age=20;
	public static void main(String[] args)
	{
		EligibleOrNotWithRT obj1=new EligibleOrNotWithRT();
		System.out.println(obj1.Eligible());

	}
	String Eligible()
	{
		if(age>=18)
		{
			return "eligible";
		}
		else
			return "not eligible";
	}

}
