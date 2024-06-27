package com.basicprograms.al;

import java.util.*;

public class LinkedLis {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add("hi");
		ll.add(null);
		ll.add(null);
		ll.add(null);
		ll.add(null);
		ll.add(null);
        System.out.println(ll);
        ListIterator i=ll.listIterator();
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
