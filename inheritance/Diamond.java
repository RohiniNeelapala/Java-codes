package com.basicprograms.inheritance;

public class Diamond {

	public static void main(String[] args) 
	{
		D obj=new D();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
interface A
{
	void m1();
}
interface B extends A
{
	void m2();
}
interface C extends A
{
	void m3();
}
class D implements B,C
{

	public void m1()
	{
		System.out.println("i am method 1");
		
	}

	public void m2() 
	{
		System.out.println("i am method 2");
		
	}

	public void m3() 
	{
		
		System.out.println("i am method 3");
	}
	
}