package com.basicprograms.loop;

public class Collatz
{

	public static void main(String[] args)
	{
		  int n=3;
		  System.out.print(n+" ");
		  while(n!=1)//3!=1 //10!=1  //5!=1 //16!=1 //8!=1  //4!=1  //2!=1  1!=1
		  {
			  if(n%2==0)
			  {
		          n=n/2;//5 8  4  2  1
			  }
			  else
			  {
				  n=3*n+1;//3*3+1=10 16
			  }
			  System.out.print(n+" ");
		  }

	}

}
