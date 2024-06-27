package com.basicprograms.loop;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to abc store");
		int quantity=0,lcost=45000,mcost=2000,kcost=2000,ccost=5000,hcost=15000,total=0;
		do{
			System.out.println("available products are");
			System.out.println("1.laptops\n2.mouse\n3.keyboard\n4.CPU\n5.HardDisk");
			System.out.println("which products do you want to purchase");
			int product=sc.nextInt();
			switch(product)
			{
			    case 1:
			    	System.out.println("laptop\n cost is 45000");
			    	System.out.println("enter quantity");
			    	quantity=sc.nextInt();
			    	int lprice=quantity*lcost;
			    	total=total+lprice;
			    break;
			    case 2:
			    	System.out.println("mouse\n cost is 2000");
			    	System.out.println("enter quantity");
			    	quantity=sc.nextInt();
			    	int mprice=quantity*mcost;
			    	total=total+mprice;
			    break;
			    case 3:
			    	System.out.println("keyboard\n cost is 2000");
			    	System.out.println("enter quantity");
			    	quantity=sc.nextInt();
			    	int kprice=quantity*kcost;
			    	total=total+kprice;
			    break;
			    case 4:
			    	System.out.println("CPU\n cost is 5000");
			    	System.out.println("enter quantity");
			    	quantity=sc.nextInt();
			    	int cprice=quantity*ccost;
			    	total=total+cprice;
			    break;
			    case 5:
			    	System.out.println("HardDisk\n cost is 15000");
			    	System.out.println("enter quantity");
			    	quantity=sc.nextInt();
			    	int hprice=quantity*hcost;
			    	total=total+hprice;
			    break;
			    default:
			    	 System.out.println("please choose from above items "+product+" is not found");
			    	 
			    
			    	
			}
			System.out.println("do you want to continue");
			   char decision=sc.next().charAt(0);
			   if(decision=='n')
			   {
			    System.out.println("your total bill is "+total);
			    break;
			   }
			   else if(decision!='y')
			   {
				   System.out.println("invalid");
				   break;
			   }
		                                                              
		}while(true);
				

	}

}
