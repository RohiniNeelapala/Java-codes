package com.basicprograms.al;

import java.util.Arrays;
import java.util.*;

public class HasSet {

	public static void main(String[] args) 
	{
		Set s=new HashSet(Arrays.asList(1,2,2,"rohini","rohini",'r','r',0,null,null,null));
        System.out.println(s);
        s.add(5);
        s.add(10);
        System.out.println(s);
        s.remove(5);
        System.out.println(s);
        System.out.println(s.isEmpty());
        Iterator i=s.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
	}

}
