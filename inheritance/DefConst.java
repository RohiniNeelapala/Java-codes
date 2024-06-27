package com.basicprograms.inheritance;

public class DefConst {

	public static void main(String[] args)
	{
		Myclass obj=new Myclass();
		obj.cal();
         
	}

}
class Myclass
{
	int x=10;
	int y;
	int z;
	Myclass()
	{
		System.out.println("i am constructor");
		y=50;
		z=80;
	}
	void cal()
	{
		System.out.println(x+y+z);
	}
}