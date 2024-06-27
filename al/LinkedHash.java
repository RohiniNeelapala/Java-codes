package com.basicprograms.al;

import java.util.*;

public class LinkedHash {

	public static void main(String[] args)
	{
		Set s=new LinkedHashSet(Arrays.asList(1,2,"rohini",'a',3,0));
		//System.out.println(s);
		s.add(2);
		s.add(3);
		s.add(0);
		s.add("rohini");
		s.add(null);
		s.add(null);
		s.add(null);
		System.out.println(s);
		

	}

}
