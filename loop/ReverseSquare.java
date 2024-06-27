package com.basicprograms.loop;
import java.util.Scanner;
public class ReverseSquare {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		int rev=0,temp=number,rev1=0,power=0;
		while(number>0)//1234>0    123>0     12>0   1>0
		{
			int remainder=number%10;//1234%10 4     3     2     1
			rev=rev*10+remainder;//0+4    4      43    432    4321
			number=number/10;//123    12      1    0
		}
		//System.out.println(rev);//4321
		number=temp;
		while(rev>0)//4321>0   432>0   43>0   4>0
		{
			int remainder=rev%10;//1   2   3    4
			power=(int)Math.pow(remainder, 2);//1  4   9   16
			//rev1=rev1*10+remainder;//1  2    3    4
			rev=rev/10;//432   43   4  0
			System.out.print(power);//14916
		}
			

	}

}
