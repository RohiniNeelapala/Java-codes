package com.basicprograms.al;

import java.util.*;

public class Vectorss {

	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add(10);
		v.add("rohini");
		v.add('h');
		v.add(100);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(null);
		v.add("rohini");
		v.add(null);
		v.add(100);
		v.add(100);
		v.add("rohini");
		v.add("rohini");
		v.add(null);
		System.out.println(v);
		System.out.println(v.get(5));
		v.add(1, 80);
	}

}
