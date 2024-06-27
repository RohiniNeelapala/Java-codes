package com.basicprograms.loop;
import java.util.Scanner;
public class SmallApp 
{
	public static void main(String args[])
	{
	  Scanner s=new Scanner(System.in);
	  int quantity=0,lcost=50000,mcost=1000,kcost=2000,ccost=5000,hcost=15000,total=0;
	  System.out.println("welcome to Abc Store");
	  while(true)
	  {
	   System.out.println("Available products are");
	   System.out.println("1.Laptops\n2.Mouse\n3.Keyboard\n4.CPU\n5.HardDisk");
	   System.out.println("Which product you want to purchase");
	   int product=s.nextInt();
	  
	  
	   switch(product)
	   {
	    case 1:
	     System.out.println("Laptop\nCost is 50000");
	     System.out.println("enter quantity");
	     quantity=s.nextInt();
	     int lprice=quantity*lcost;
	     total=total+lprice;
	     break;
	    case 2:
	     System.out.println("Mouse\nCost is 1000");
	     System.out.println("enter quantity");
	     quantity=s.nextInt();
	     int mprice=quantity*mcost;
	     total=total+mprice;
	     break;
	    case 3:
	     System.out.println("Keyboard\nCost is 2000");
	     System.out.println("enter quantity");
	     quantity=s.nextInt();
	     int kprice=quantity*kcost;
	     total=total+kprice;
	     break;
	    case 4:
	     System.out.println("CPU\nCost is 5000");
	     System.out.println("enter quantity");
	     quantity=s.nextInt();
	     int cprice=quantity*ccost;
	     total=total+cprice;
	     break;
	    case 5:
	     System.out.println("HardDisk\nCost is 15000");
	     System.out.println("enter quantity");
	     quantity=s.nextInt();
	     int hprice=quantity*hcost;
	     total=total+hprice;
	     break;
	    default:
	     System.out.println("please choose from above items "+product+" is not found");
	     
	   }
	   System.out.println("do you want to continue");
	   char decision=s.next().charAt(0);
	   if(decision=='n')
	   {
	    System.out.println("your total bill is "+total);
	    break;
	   }
	   
	  
	  }
	 
	 
	 
	}
	}
