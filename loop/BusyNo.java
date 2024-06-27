package com.basicprograms.loop;

public class BusyNo {

	public static void main(String[] args)
	{
		 int number=27;
         while(number>0)
         {
              int remainder=number%10;
              if(remainder==7&&remainder%7==0)
              {
                    System.out.println("busy number");
              }
              else
              {
                  System.out.println(" not a busy number");
              }
               break;
              
         }

	}

}
