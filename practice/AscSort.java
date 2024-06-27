package com.basicprograms.practice;

public class AscSort {

	public static void main(String[] args)
	{
	     int a[]= {35,89,2,-1,10,9,6,677};
	     int b[]={35,89,2,-1,10,9,6,677};
	     for(int x=0;x<a.length;x++)
	     {
	    	 for(int y=x+1;y<a.length;y++)
	    	 {
	    		 if(a[x]>a[y])
	    		 {
	    			 int temp=a[x];
	    			 a[x]=a[y];
	    			 a[y]=temp;
	    		 }
	    	 }
	     }
	     for(int x=0;x<a.length;x++)
	     {
	    	 System.out.println(a[x]);
	     }
	     System.out.println("____________");
	     
	     
	     for(int x=0;x<b.length;x++)
	     {
	    	 for(int y=x+1;y<b.length;y++)
	    	 {
	    		 if(b[x]<b[y])
	    		 {
	    			 int temp=b[x];
	    			 b[x]=b[y];
	    			 b[y]=temp;
	    		 }
	    	 }
	     }
	     for(int x=0;x<b.length;x++)
	     {
	    	 System.out.println(b[x]);
	     }

	}

}
