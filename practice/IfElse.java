package com.basicprograms.practice;

public class IfElse {

	public static void main(String[] args)
	{
		int a=10,b=20;
		if(a>b)
		{
			System.out.println(a+" is large");
		}
		else
		{
			System.out.println(b+" is large");
		}
		
		System.out.println("____");
		int age=18;
		if(age>=18)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
		System.out.println("___");
		int num=20;
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		System.out.println("_________");
		int total=99;
		if(total>=80)
		{
			System.out.println("a");
		}
		else if(total>=60)
		{
			System.out.println("b");
		}
		else if(total>=40)
		{
			System.out.println("c");
		}
		else
		{
			System.out.println("fail");
		}
		System.out.println("______");
		int month=2;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("31 days");
		}
		else if(month==4||month==6||month==9||month==11)
		{
			System.out.println("30 days");
		}
		else
		{
			System.out.println("28 days");
		}
		System.out.println("_______");
		int number=15;
		if(number%3==0&&number%5==0)
		{
			System.out.println("fizzbuzz");
		}
		else if(number%3==0)
		{
			System.out.println("fizz");
		}
		else if(number%5==0)
		{
			System.out.println("buzz");
		}
		else
		{
			System.out.println("invalid input");
		}
		System.out.println("______");
		char ch='e';
		if(ch>='a'&&ch<='z')
		{
			System.out.println("small");
		}
		else if(ch>='A'&&ch<='Z')
		{
			System.out.println("capital");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("digit");
		}
		else if(ch==' ')
		{
			System.out.println("space");
		}
		else
		{
			System.out.println("symbol");
		}
		System.out.println("____________");
		int numb=10;
		String result=numb%2==0?"even":"odd";
        System.out.println(result);
        System.out.println("___________");
        int x=10,y=20,z=30;
        if(x>y&&x>z)
        {
        	System.out.println(x+" is large");
        }
        else if(y>z)
        {
        	System.out.println(y+" is large");
        }
        else
        {
        	System.out.println(z+" is large");
        }
        System.out.println("________");
        System.out.println((x>y&&x>z)?"x is large":(y>z)?"y is large":"z is large");
	}

}
