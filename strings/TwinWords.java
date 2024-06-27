package com.basicprograms.strings;

public class TwinWords {

	public static void main(String[] args)
	{
		String s="Hello madam how ahe many mind";
		String a[]=s.split(" ");
		int count=0;
		for(int x=0;x<a.length;x=x+2)
		{
			String word=a[x];
			if(a.length%2==0)
			{
				if(a[x].length()==a[x+1].length())
				{
					count++;
				}
				else
				{
					break;
				}
			}
			
		}
		if(a.length/2==count)
		{
			System.out.println("twin words");
		}

	}

}
