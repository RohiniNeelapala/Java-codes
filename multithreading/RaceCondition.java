package com.basicprograms.multithreading;

public class RaceCondition {

	public static void main(String[] args)
	{
		U u=new U();
		Thread t1=new Thread(u,"one");
		Thread t2=new Thread(u,"two");
		Thread t3=new Thread(u,"three");
		Thread t4=new Thread(u,"four");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
class U implements Runnable
{
     int count;
	@Override
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println(Thread.currentThread().getName()+"==> "+(++count));
		}
		
	}
	
}