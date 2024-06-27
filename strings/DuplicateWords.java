package com.basicprograms.strings;

public class DuplicateWords {

	public static void main(String[] args)
	{
		String s="hello all good morning all good evening";
		String a[]=s.split(" ");
		boolean b[]=new boolean[a.length];
		for(int x=0;x<a.length;x++)
		{
			int count=1;
			String word=a[x];
			if(b[x]==true)
			{
				continue;
			}
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x].equals(a[y]))
				{
					b[y]=true;
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[x]);
			}
		}

	}

}
