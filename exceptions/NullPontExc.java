package com.basicprograms.exceptions;

public class NullPontExc {

	public static void main(String[] args) 
	{
		Myclass obj=new Myclass();
		obj.add();
		obj=null;
		obj.add();
	}

}
class Myclass
{
	void add()
	{
		System.out.println("hi");
	}
}