package com.basicprograms.practice;

import java.util.Scanner;

public class Wile {

	public static void main(String[] args)
	{
	   for(int x=1;x<=5;x++)
	   {
		   for(int y=5;y>=x;y--)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	   System.out.println("_________");
	   for(int x=1;x<=5;x++)
	   {
		   for(int y=1;y<=x;y++)
		   {
			   System.out.print("* " );
		   }
		   System.out.println();
	   }
	   System.out.println("________");
	   
	   for(int x=1;x<=5;x++)
	   {
		   for(int y=1;y<=5;y++)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	   System.out.println("____________");
	   for(int x=1;x<=5;x++)
	   {
		   for(int y=5;y>=x;y--)
		   {
			   System.out.print(y+" ");
		   }
		   System.out.println();
	   }
	   System.out.println("______");
	   for(int x=1;x<=5;x++)
	   {
		   for(int y=1;y<=x;y++)
		   {
			   System.out.print(y+" ");
		   }
		   System.out.println();
	   }
	   System.out.println("____________");
	   for(int x=1;x<=5;x++)
	   {
		   for(int y=1;y<=5;y++)
		   {
			   if(x==1||x==5||y==1||y==5)
			   {
				   System.out.print("* ");
			   }
			   else
			   {
				   System.out.print("  ");
			   }
		   }
		   System.out.println();
	   }
	   System.out.println("_________");
	   
	   for(int x=1;x<=5;x++)
	   {
		   for(int y=1;y<x;y++)
		   {
			   System.out.print("  ");
		   }
		   for(int z=5;z>=x;z--)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	   System.out.println("_____");
	   
	   
	   for(int x=1;x<=5;x++)
	   {
		   for(int y=5;y>=x;y--)
		   {
			   System.out.print("  ");
		   }
		   for(int z=1;z<=x;z++)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
		
		
	

	}

}