package com.basicprograms.abstraction;

public class Abstrac {

	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();

	}

}
abstract class GrandParent
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();
	void m5()
	{
		System.out.println("m5");
	}
}
abstract class Parent extends GrandParent
{
	void m1()
	{
		System.out.println("m1");
	}
	void m2()
	{
		System.out.println("m2");
	}
}
class Child extends Parent
{

	@Override
	void m3() 
	{
		System.out.println("m3");
		
	}

	@Override
	void m4() 
	{
	     
		System.out.println("m4");
	}
	
}