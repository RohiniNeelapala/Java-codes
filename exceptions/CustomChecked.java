package com.basicprograms.exceptions;

public class CustomChecked {

	public static void main(String[] args) throws InsufficientBalanceException
	{
		int withdraw=6000,balance=5000;
		if(withdraw<=balance)
		{
			balance=balance-withdraw;
			System.out.println("withdraw successful "+balance);
		}
		else
		{
			throw new InsufficientBalanceException("withdraw amount is greater than "+balance);
		}

	}

}
class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}