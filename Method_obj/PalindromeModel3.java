package com.basicprograms.Method_obj;

public class PalindromeModel3 
{

	public static void main(String[] args) 
	{
	   Example obj=new Example();
	   for(int x=1;x<=200;x++)
	   {
		  // obj.reverse=0;
		   int temp=obj.Pal(x);
		   if(temp==x)
		   {
			   System.out.println(temp+" palindrome");
		   }
	   }

	}

}
class Example
{
	//int reverse=0;
	int Pal(int x)
	{
		int reverse=0;
		while(x>0)
		{
			int rem=x%10;
			reverse=reverse*10+rem;
			x=x/10;
		}
		return reverse;
	}
	
}
