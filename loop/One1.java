package com.basicprograms.loop;

public class One1{

	public static void main(String[] args)
	{
		int number=1234,reverse=0,rev=0;
		while(number>0)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		while(reverse>0) 
		{
			int remainder=reverse%10;
			switch(remainder)
			{
			    case  1:
			    	System.out.println("one");
			    break;
			    case 2:
			    	System.out.println("two");
			    break;
			    case 3:
			    	System.out.println("three");
				break;
			    case 4:
			    	System.out.println("four");
				 break;
				default:
					System.out.println("zero");
				   
			}
			reverse=reverse/10;
		}
	

	}

}
