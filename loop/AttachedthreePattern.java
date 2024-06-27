package com.basicprograms.loop;

public class AttachedthreePattern
{

	public static void main(String[] args)
	{
	     int rows=5;
	     for(int x=1;x<=rows;x++)
	     {
	    	 for(int y=1;y<=x;y++)
	    	 {
	    		 System.out.print("- ");
	    	 }
	    	 for(int z=rows;z>=x;z--)
	    	 {
	    		 System.out.print("* ");
	    	 }
	    	 for(int a=rows;a>x;a--)
	    	 {
	    		 System.out.print("* ");
	    	 }
	    	 System.out.println();
	     }

	}

}
