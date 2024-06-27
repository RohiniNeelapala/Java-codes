package com.basicprograms.inheritance;

public class Hybrid 
{

	public static void main(String[] args)
	{
		Ug obj=new Ug();
		obj.Hlo();
		obj.Hi();
		obj.add();
		Pg obj1=new Pg();
		obj1.Hlo();
		obj1.Hi();
		obj1.Wow();

	}

}
class University
{
    void Hlo()
    {
    	System.out.println("i am university");
    }
   
}
class College extends University
{
	void Hi()
	{
		System.out.println("i am college");
	}
	
}
class Ug extends College
{
	void add()
	{
		System.out.println("i am ug extends college");
	}
}
class Btech extends Ug
{
	void sub()
	{
		System.out.println("i am btech extends ug");
	}
}
class Bsc extends Ug
{
	void div()
	{
		System.out.println("i am bsc extends ug");
	}
}
class Pg extends College
{
	void Wow()
	{
		System.out.println("i am pg extends college");
	}
}
class Mca extends Pg
{
	void Wor()
	{
		System.out.println("i am mca extends pg");
	}
	
	
}
class Mtech extends Pg
{
	void hii()
	{
		System.out.println("i am mtech extends pg");
	
	}
	
}
