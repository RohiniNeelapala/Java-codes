package com.basicprograms.loop;
import java.util.Scanner;
public class Myclass {

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       char decision;
       while(true)
       {
    	   System.out.println("enter number");
    	   int num=sc.nextInt();
    	   if(num%2==0)
    	   {
    		   System.out.println("even");
    	   }
    	   else
    	   {
    		   System.out.println("odd"); 
    	   }
    	   System.out.println("do you want to continue");
    	   decision=sc.next().charAt(0);
    	   if(decision=='n')
    	   {
    		   break;
    	   }
    	   else if(decision!='y')
    	   {
    		   System.out.println("invalid");
    		   break;
    	   }
       }

	}

}
