package com.basicprograms.practice;

public class Inheritanc {

	public static void main(String[] args)
	{
	    Child1 obj=new Child1();
	    obj.add();
	    obj.sub();
	    Child2 obj2=new Child2();
	    obj2.div();

	}

}
class Parent
{
	Parent()
	{
		System.out.println("i am parent con");
	}
	void add()
	{
		System.out.println("i am add");
	}
}
class Child1 extends Parent
{
	Child1()
	{
		System.out.println("i am child con");
	}
	void sub()
	{
		System.out.println(" i am sub");
	}
	
}
class Child2 extends Parent
{
	Child2()
	{
		System.out.println("i am gc con");
	}
	void div()
	{
		System.out.println("i am div");
	}
}