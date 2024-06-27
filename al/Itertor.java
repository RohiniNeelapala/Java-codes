package com.basicprograms.al;

import java.util.*;
import java.util.Arrays;

public class Itertor {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList(Arrays.asList(10,30,40,5.6,"rohi",'a'));
        Iterator i=al.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
	}

}
