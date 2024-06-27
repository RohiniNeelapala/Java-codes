package com.basicprograms.loop;

public class AlphabetsPattern {

	public static void main(String[] args) 
	{
	/*	int temp;
		for(int x=1;x<=5;x++)
		{
			temp=65;
			for(int y=1;y<=x;y++)
			{
				System.out.print((char)temp+" ");
				temp++;
			}
			System.out.println();
		}*/
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
			System.out.println((count==2)?start+"p":start+"np");

	}
	}
}
