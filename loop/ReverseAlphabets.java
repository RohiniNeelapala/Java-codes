package com.basicprograms.loop;

public class ReverseAlphabets 
{

	public static void main(String[] args) 
	{
		int temp;
		for(int x=5;x>=1;x--)
		{
			temp=65;
			for(int y=1;y<=x;y++)
			{
				System.out.print((char)temp+" ");
				temp++;
			}
			System.out.println();
		}

	}

}
