package com.basicprograms.Method_obj;

public class LeapYearWithRT {

	public static void main(String[] args)
	{
		Year obj=new Year();
		System.out.println(obj.LeapYear());
		System.out.println(obj.year);

	}

}
class Year
{
	int year=2024;
	String LeapYear()
	{
		if(year%4==0&&year%100!=0||year%400==0)
		{
			return "leap year";
		}
		else
		{
			return "not a leap year";
		}
	}
}
