package com.basicprograms.arrays;

public class Selection_sort
{

	public static void main(String[] args) 
	{
       int a[]=new int[] {2,4,10,40,100,5};
       int min=0;
       for(int x=0;x<a.length-1;x++)
       {
    	   min=x;
    	   for(int y=x+1;y<a.length;y++)
    	   {
    		   if(a[min]>a[y])
    		   {
    			   min=y;
    		   }
    	   }
    	   int temp=a[x];
    	   a[x]=a[min];
    	   a[min]=temp;
       }
       for(int t:a)
       {
    	   System.out.print(t+"  ");
       }
    	   
   }

}
