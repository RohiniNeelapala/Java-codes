package com.basicprograms.loop;

public class AttachedHolyPattern
{

	public static void main(String[] args)
	{
		int rows=5;
		for(int x=1;x<rows;x++)
		{
			for(int y=rows;y>=x;y--)
			{
				if(x==1||x==y||y==1||y==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||i==5||i==j||j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
