package com.basicprograms.al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListItertor {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList(Arrays.asList(1,40.4,"hi",'r',3000));
		ListIterator i=al.listIterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        System.out.println("__________");
        while(i.hasPrevious())
        {
        	System.out.println(i.previous());
        }
	}

}
