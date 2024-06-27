package com.basicprograms.abstraction;

public class Prac 
{
    
	public static void main(String[] args)
	{
	   
		Hlo obj=new Hlo();
		System.out.println(Hlo.name);
		Hlo.name="kanth";
		obj.x=10;
	}
}
class Hlo

{
	 Hlo()
	{
		 this(10);
		System.out.println("i am a constructor");
	}
	Hlo(int x)
	{
		System.out.println("i am 2nd const");
	}
	int x;
	static String name = "chandu";
	void add(String name)
	{
		this.name=name;
		System.out.println(this.name);
	}
}


