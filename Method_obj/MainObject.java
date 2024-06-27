package com.basicprograms.Method_obj;

public class MainObject 
{
    String name="Rohini";
	public static void main(String[] args)
	{
	   MainObject obj=new MainObject();
	   System.out.println("name is"+obj.name);
	   obj.display();
	   obj.print();

	}
	void display()
	{
		System.out.println("name is"+name);
	}
	void print()
	{
		System.out.println("name is "+name);
	}

}

