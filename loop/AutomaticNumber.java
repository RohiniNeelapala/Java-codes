package com.basicprograms.loop;

 public class AutomaticNumber
{
    public static void main(String[] args) 
	{
    	 int number=6,temp=number,count=0;
    	 int result=number*number;
    	 while(number>0)
    	 {
    		 count++;
    		 number/=10;
    	 }
    	 int remainder=result%(int)Math.pow(10,count);
    	 if(remainder==temp)
    	 {
    		 System.out.println("automatic number");
    	 }
	}
}