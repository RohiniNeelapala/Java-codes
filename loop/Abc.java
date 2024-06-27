package com.basicprograms.loop;

public class Abc {

	public static void main(String[] args) {
		for(int start=1;start<=10;start++)
		{
			int count=0;
			for(int i=1;i<=start;i++)
			{
				if(start%i==0)
				{
					count++;
				}
			}
			if(count==2)
				System.out.println(start+"p");
			else
				System.out.println(start+"np");
			
			
			System.out.println(count==2?"p":"np");

		}
	}

}
