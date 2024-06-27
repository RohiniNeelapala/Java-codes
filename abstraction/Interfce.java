package com.basicprograms.abstraction;

public class Interfce 
{

	public static void main(String[] args) 
	{
		Gchild obj=new Gchild();
        System.out.println(Two.x);
        System.out.println(Ch.y);
	}

}
interface One
{
	void m1(); 
}
interface Two extends One
{
	int x=10;
	void m2();
}
abstract class Ch implements Two
{
	static int y=60;
	public void m1()
	{
		System.out.println("m1");
	}
	
}
class Gchild extends Ch
{

	public void m2() 
	{
		System.out.println("m2");
		
	}
	
}