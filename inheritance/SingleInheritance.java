package com.basicprograms.inheritance;

public class SingleInheritance {

	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.Hlo();
		obj.Hi();

	}

}
class Parent
{
	void Hlo()
	{
		System.out.println("i am parent");
	}
}
class Child extends Parent
{
	void Hi()
	{
		System.out.println("i am child");
	}
}