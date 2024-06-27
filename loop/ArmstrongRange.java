package com.basicprograms.loop;
import java.util.Scanner;
public class ArmstrongRange
{

	public static void main(String[] args) 
	{
	    int end=500;
	    
	    for(int start=1;start<=end;start++)
	    {
	    	int count=0,sum=0;int num=start;
	    	for( num=start;num>0;num/=10)
	    	{
	    		int rem=num%10;
	    		count++;
	    	}
	    	num=start;
	    	while(num>0)
	    	{
	    		int rem=num%10;
	    		int power=(int)Math.pow(rem,count);
	    		sum=sum+power;
	    		num/=10;
	    	}
	    	if(sum==start)
	    	{
	    		System.out.println(start+" armstrong number");
	    	}
	    }

	}

}
