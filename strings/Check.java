package com.basicprograms.strings;

public class Check {

	public static void main(String[] args) 
	{
		String s="hello ALL";
		int count=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch>='A'&&ch<='Z')
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					count3++;
				}
				
				count++;
			}
			else if(ch>='a'&&ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count2++;
				}
				
				count1++;
			}
			else if(ch>='0'&&ch<='9')
			{
				count4++;
			}
			else if(ch==' ')
			{
				count5++;
			}
			else
			{
				count6++;
			}
		}
		System.out.println("no of capital letters "+count);
		System.out.println("no of small letters "+count1);
		System.out.println("no of small vowels "+count2);
		System.out.println("no of capital vowels "+count3);
		System.out.println("no of digits "+count4);
		System.out.println("no of spaces "+count5);
		System.out.println("no of symbols "+count6);

	}

}
