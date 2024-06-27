package com.basicprograms.multithreading;

public class Mtex
{

	public static void main(String[] args)
	{
		User u1=new User();
		User u2=new User();
		User u3=new User();
		u1.start();
		u2.start();
		u3.start();
		u1.setName("one");
		u2.setName("two");
		u3.setName("three");
		System.out.println(u1.MAX_PRIORITY);
		System.out.println(u2.MIN_PRIORITY);
		System.out.println(u3.NORM_PRIORITY);
		for(int x=0;x<2;x++)
		System.out.println(Thread.currentThread().getName());

	}

}
class User extends Thread
{
	public void run()
	{
		for(int x=0;x<2;x++)
		System.out.println(Thread.currentThread().getName());
	}
	
}