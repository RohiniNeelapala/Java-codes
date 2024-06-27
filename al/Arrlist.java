package com.basicprograms.al;

import java.util.*;
import java.util.Scanner;

public class Arrlist
{

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20.4);
		al.add("hi");
		al.add('h');
		al.add(20);
		System.out.println(al);
		System.out.println("______");
		for(Object temp:al)
		{
			System.out.println(temp);
		}
		System.out.println("________");
		for(int x=0;x<al.size();x++)
		{
			System.out.println(al.get(x));
		}
		ArrayList a=new ArrayList();
		Scanner sc=new Scanner(System.in);
		for(int x=0;true;x++)
		{
			System.out.println("enter values");
			a.add(sc.nextInt());
			System.out.println("do u want to continue");
			char c=sc.next().charAt(x);
			if(c=='n')
			{
				break;
			}
		}

	}

}
