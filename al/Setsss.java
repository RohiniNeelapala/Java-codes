package com.basicprograms.al;

import java.util.*;

public class Setsss {

	public static void main(String[] args) 
	{
		
		ArrayList al=new ArrayList(Arrays.asList(1,2,3,4,"rih",'j',3,"rih",'j'));
		System.out.println(al);
		Set s=new HashSet(al);
        s.add(10);
        System.out.println(s);
        s.add(null);
        s.add(null);
        s.add(null);
        System.out.println(s);
       System.out.println(s.contains(null)); 
       Iterator i=s.iterator();
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }
	}

}
