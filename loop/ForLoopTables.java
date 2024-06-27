package com.basicprograms.loop;

public class ForLoopTables {

	public static void main(String[] args) 
	{
		for(int number=1;number<=10;number++)
		{
			for(int num1=1;num1<=10;num1++)
			{
				int product=number*num1;
				System.out.println(number+" * "+num1+" = "+product);
			}
			System.out.println("_____________________");
		}
			
		

	}

}
