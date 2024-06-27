package com.basicprograms.strings;

public class Constructors {

	public static void main(String[] args) 
	{
		Myclass obj1=new Myclass(30,40,50,60,70,80);
		obj1.Display();

	}

}
class Myclass
{
	String name;
	int rno;
	int m1,m2,m3,m4,m5,m6;
	Myclass()
	{
		name="rohini";
		rno=10;
	}
	Myclass(int m1,int m2,int m3,int m4,int m5,int m6)
	{
		this();
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		this.m6=m6;
	}
	void Display()
	{
		System.out.println(name+" "+rno+" "+m1+" "+m2+" "+m3+" "+m4+" "+m5+" "+m6);
	}
}

