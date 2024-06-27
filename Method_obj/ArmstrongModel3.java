package com.basicprograms.Method_obj;

public class ArmstrongModel3
{

	public static void main(String[] args) 
	{
		Example1 ex=new Example1();
		for(int z=1;z<=200;z++)//x=1
		{
			int result=ex.Arm(z);//ex.arm(1)
			if(result==z)
				System.out.println(z+" Arm");
		}
		

	}

}
class Example1
{
	int Arm(int x)
	{
		int sum=0,temp=x,count=0;
		while(x>0)
		{
	          count++;
	          x=x/10;
		}
		x=temp;
		while(x>0)
		{
			int rem=x%10;
			int power=(int)Math.pow(rem,count);
			sum=sum+power;
			x=x/10;
		}
		return sum;
		
	}
}
