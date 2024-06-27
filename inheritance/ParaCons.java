package com.basicprograms.inheritance;

public class ParaCons {

	public static void main(String[] args)
	{
		Hi obj=new Hi(40,50,60,45,65,70);
		obj.display();

	}

}
class Hi
{
	String name;
	int rno;
	int m1,m2,m3,m4,m5,m6;
	Hi()
	{
		name="rohini";
		rno=100;
	}
	Hi(int m1,int m2,int m3,int m4,int m5,int m6)
	{
		this();
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		this.m6=m6;
		
	}
	void display()
	{
		System.out.println(name+" "+rno+" "+m1+" "+m2+" "+m3+" "+m4+" "+m5+" "+m6);
	}
}