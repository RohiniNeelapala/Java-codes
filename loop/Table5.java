package com.basicprograms.loop;
import java.util.Scanner;
public class Table5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		for(int start=1;start<=10;start++)//1<=10    2<=10     3<=10  4<=10    5<=10    6<=10  7<=10    8<=10 9<=10 10<=10 11<=10
		{
			int product=number*start;//6*1   6   12   18  24  30      36   42  48   54  60
			System.out.println(number+" * "+start+" = "+product);//6*1=6   6*2=12   6*3=18  6*4=24   6*5=30 6*6=36  6*7=42  6*8=48   6*9=54 6*10=60
		}

	}

}
