package com.basicprograms.arrays;

public class DuplicateEle
{

	public static void main(String[] args) 
	{
	     int a[]=new int[] {10,20,20,9,30,30,30};
	     
	     for(int x=0;x<a.length-1;x++)
	     {
	    	 for(int y=x+1;y<a.length;y++)
	    	 {
	    		if(a[x]==a[y])
	    		{
	    			  System.out.println(a[y]);
	    		}
	    	 }
	     }
	     
	 }

}
