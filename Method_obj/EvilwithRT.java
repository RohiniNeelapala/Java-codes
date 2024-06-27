package com.basicprograms.Method_obj;

public class EvilwithRT {

	public static void main(String[] args)
	{
		EvilNo evilno=new EvilNo();
		System.out.println(evilno.EvilOrNot());

	}

}
class EvilNo
{
	String EvilOrNot()
	{
		int num=9,sum=0;
		int power=(int)Math.pow(num, 2);
		while(power>0)
		{
			int rem=power%10;
			sum=sum+rem;
			power=power/10;
		}
		return sum==num?"evil":"not evil";
	}
	
}
