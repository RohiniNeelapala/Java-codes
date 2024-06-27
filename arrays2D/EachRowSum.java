package com.basicprograms.arrays2D;

public class EachRowSum 
{

	public static void main(String[] args) 
	{
		int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int max=0;
		for(int r=0;r<a.length;r++)
		{
			int sum=0;
			for(int c=0;c<a[r].length;c++)
			{
				sum=sum+a[r][c];
			}
			System.out.println(sum);
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println("maximum sum is");
		System.out.println(max);
      
	}

}
