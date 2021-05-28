package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.ServiceImplement.SBI;

public class Test {
	public static void main(String[] args) {

		System.out.println("*=====================================================*");
		System.out.println("*          WelCome to Bank Management System          *");
		System.out.println("*=====================================================*");

		int x;
		SBI b = new SBI();
		Scanner p = new Scanner(System.in);
		String c;
		do

		{
			System.out.println();
			System.out.println("Enter Choice");
			System.out.println();
			System.out.println("1:Create Account");
			System.out.println("2:Display All Details");
			System.out.println("3:Diposite Money");
			System.out.println("4:Withdrawn");
			System.out.println("5.AccountBalance");
			System.out.println("0: Exit");

			x = p.nextInt();

			switch (x) {
			case 1:
				b.createAccount();
				break;

			case 2:
				b.displayAllDetails();
				break;

			case 3:
				b.dipositeMoney();
				break;

			case 4:
				b.withdrawn();
				break;

			case 5:
				b.accountBalance();
				break;

			case 0:
				System.out.println("*=================================================================*");
				System.out.println("*                  Thank you for your Services                    *");
				System.out.println("*                        Visit Again !!                           *");
				System.out.println("*=================================================================*");
				System.exit(0);
				break;
			}
				System.out.println("");
				System.out.println("Do you want to continue Press Y for Yes and N for No");
				c = p.next();

		} while (c.equals("Y") || c.equals("y"));
			   System.out.println("*=================================================================*");
			   System.out.println("*                   Thank you for your Visit                      *");
			   System.out.println("*                       Have a Good Day !!                        *");
			   System.out.println("*=================================================================*");
	}
}
