package com.hdfc.loans.carloans;

public class Kotak implements Rbi

{

	@Override
	public void withdrawl() {
		System.out.println("i am overridden withdrawl in kotak");
	}

	@Override
	public void deposit() {
		System.out.println("i am overridden deposit in kotak");
	}

	public static void main(String[] args)
	{
		
		Kotak k=new Kotak();
		k.deposit();
	k.withdrawl();
	}

}
