package com.basicprograms.Method_obj;

public class addition
{
    int x=10,y=20;
	public static void main(String[] args)
	{
		addition obj2=new addition();
		obj2.add();
		System.out.println(obj2.x);
		obj2.x=35;
		System.out.println(obj2.x);
		obj2.y=60;
		System.out.println(obj2.y);
		
		

	}
	void add()
	{
		int z=x+y;
		System.out.println(z);
	}

}
