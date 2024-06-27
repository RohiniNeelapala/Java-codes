package com.basicprograms.Method_obj;

public class PowerNoWithRT {

	public static void main(String[] args) 
	{
		PowerNoWithRT obj=new PowerNoWithRT();
		System.out.println(obj.power());

	}
	String power()
	{
		int num=123,sum=0,pro=1;
		while(num>0)
		{
			int remainder=num%10;
			sum=sum+remainder;
			pro=pro*remainder;
			num=num/10;
		}
		if(sum==pro)
		{
			return "power num";
		}
		else
		{
			return "not a power num";
		}
	}

}
