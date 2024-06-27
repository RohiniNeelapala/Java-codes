package com.basicprograms.exceptions;

public class ThrowsKeyword
{

	public static void main(String[] args) throws InterruptedException 
	{
		Hi obj=new Hi();
		obj.m3();
	}

}
class Hi
{
	void m1() throws InterruptedException  
	{
		throw new InterruptedException();
	}
	void m2() throws InterruptedException  
	{
		m1();
		
	}
	void m3() throws InterruptedException 
	{
		m2();
	}
}