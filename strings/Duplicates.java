package com.basicprograms.strings;

public class Duplicates {

	public static void main(String[] args) 
	{
		String name="heollo";
		char a[]=name.toCharArray();
		boolean b[]=new boolean[a.length];
		for(int x=0;x<a.length-1;x++)
		{
			int count=1;
			if(b[x]==true)
			{
				continue;
			}
			for(int y=x+1;y<a.length;y++)
			{
			    if(a[x]==a[y])
			    {
			    	b[y]=true;
			    	count++;
			    }
			}
			if(count>1)
			{
				System.out.println(a[x]+"its a dublicate");
			}
		}
		
	}

}
