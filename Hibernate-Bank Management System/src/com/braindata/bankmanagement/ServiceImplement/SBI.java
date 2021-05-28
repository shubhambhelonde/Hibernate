package com.braindata.bankmanagement.ServiceImplement;

import java.util.Scanner;
import org.hibernate.Session;
import com.braindata.bankmanagement.Service.HibernateUtil;
import com.braindata.bankmanagement.Service.RBI;
import com.braindata.bankmanagement.model.Account;

public class SBI implements RBI 
{
	@SuppressWarnings("resource")
	public void createAccount() 
	{
			Account a = new Account();
			Scanner s = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			Session session =HibernateUtil.getSessionFactory().openSession();
			
			System.out.println("=============================================");
			System.out.println("         Fill Account Holder Details         ");
			System.out.println("=============================================");
			
			System.out.println("Enter Account No ");
			while(true)
			{
			String s1=s.next();
			if(s1.matches("[345]{1}[0-9]{10}"))
			 	{
					a.setAccNo(s1);
					break;
			 	}
			else
				{
					System.out.println("Enter Valid Account No");
				}
			}
			
			System.out.println("Enter Name ");
			while(true)
			{
			String s2 = sc.nextLine();
			if (s2.matches("[a-zA-Z ]*")) 
				{
					a.setName(s2);
					break;
				}
			else 
				{
					System.out.println("Enter valid name");
				}
			}
				
			System.out.println("Enter mobNo ");
			while(true)
			{
			String s3 = s.next();
			if ((s3.matches("[789]{1}[0-9]{9}"))) 
				{
					a.setMobNo(s3);
					break;
			}
			else
				{
					System.out.println("Enter valid Mobile Number");
				}
			}
	
			System.out.println("Enter AddharCard No ");
			while(true)
			{
			String s4 = s.next();
			if ((s4.matches("[0-9]{12}"))) 
				{
					a.setAdharNo(s4);
					break;
				}
			else
				{
					System.out.println("Enter valid AddharCard No Number");
				}
			}
		
			System.out.println("Enter gender");
			String s5 = sc.next();
			a.setGender(s5);
				
			System.out.println("Enter age");
			int s6 = s.nextInt();
			a.setAge(s6);
				
			System.out.println("Enter minbal");
			int s7 = s.nextInt();
			a.setMinBal(s7);
			
			System.out.println("Create your Password");
			int s8=s.nextInt();
			a.setPassword(s8);
			
			session.save(a);
			session.beginTransaction().commit();
			System.out.println("====================================================");
			System.out.println("           Your Account Created Successfully        ");
			System.out.println("====================================================");
	}

	@SuppressWarnings("resource")
	@Override
	public void displayAllDetails()
	{
		Session session =HibernateUtil.getSessionFactory().openSession();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your Account No");
		while(true)
		{
		String d=sc1.next();
		Account ac=session.get(Account.class,d);
		try 
		{
		if(d.equals(ac.getAccNo()))
		{
			System.out.println("Enter the Password");
			int pass=sc1.nextInt();
			if(pass==ac.getPassword())
				{
				System.out.println("=============================================");
				System.out.println("             Account Holders Details         ");
				System.out.println("=============================================");
				System.out.println("Your Account no       :" +ac.getAccNo());
				System.out.println("Your Name             :" +ac.getName());
				System.out.println("Your Mobile no        :" +ac.getMobNo());
				System.out.println("Your Addhar no        :" +ac.getAdharNo());
				System.out.println("Your Gender           :" +ac.getGender());
				System.out.println("Your Age              :" +ac.getAge());
				System.out.println("Your MinBalance       :" +ac.getMinBal());
				System.out.println("=============================================");
				System.out.println("          Data Retrive Successfully          ");
				System.out.println("=============================================");
				}
			break;
			}
		else
		{
			System.out.println("Wrong Account No");
		}
		}
		catch (Exception e) 
			{
			    System.out.println("Please,Enter Your Correct Account No");
			}
		}
	}
		

	@SuppressWarnings("resource")
	@Override
	public void dipositeMoney() 
	{
		Session session =HibernateUtil.getSessionFactory().openSession();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter your Account No");
		while(true)
		{
		String d1=sc2.next();
		Account ac1=session.get(Account.class,d1);
		try 
		{
		if(d1.equals(ac1.getAccNo()))
		{
			System.out.println("Enter the Password");
			int pass=sc2.nextInt();
			if(pass==ac1.getPassword())
				{
				System.out.println("Enter the Amount You want to Diposite in Your Bank Account");
				int amt=sc2.nextInt();
				int total_ammount=ac1.getMinBal()+amt;
				System.out.println("");
				System.out.println("New Balance After Deposite Money is :" +total_ammount);
				System.out.println("");
				ac1.setMinBal(total_ammount);
				session.save(ac1);
				session.update(ac1);
				session.beginTransaction().commit();
				System.out.println("");
				System.out.println("=============================================");
				System.out.println("      Your Money Deposited Successfully      ");
				System.out.println("        Thank You,Have a Good Day !!         ");
				System.out.println("=============================================");
				}
			break;
			}
		else
		{
			System.out.println("Wrong Account No");
		}
		}
		catch (Exception e) 
			{
				System.out.println("Please,Enter Your Correct Account No");
			}
		}
	}

	@SuppressWarnings("resource")
	@Override
	public void withdrawn() 
	{
		Session session =HibernateUtil.getSessionFactory().openSession();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter your Account No");
		while(true)
		{
		String d1=sc2.next();
		Account ac1=session.get(Account.class,d1);
		try
		{
		if(d1.equals(ac1.getAccNo()))
			{
			System.out.println("Enter the Password");
			int pass=sc2.nextInt();
			if(pass==ac1.getPassword())
				{
				System.out.println("Enter the Amount you want to withdrawn from Your Bank Account");
				int amt=sc2.nextInt();
				if (amt<=ac1.getMinBal())
				{
				int total_ammount=ac1.getMinBal()-amt;
				ac1.setMinBal(total_ammount);
				System.out.println("Current Balance after Withdrawal is :" +total_ammount);
				System.out.println("");
				System.out.println("=============================================");
				System.out.println("       Your Money Withrawn Successfully      ");
				System.out.println("        Thank You,Have a Good Day !!         ");
				System.out.println("=============================================");
				} 
				else 
				{
				System.out.println("=============================================");
				System.out.println(" Sorry,Your account has insufficient balance ");
				System.out.println("=============================================");
				}
				session.save(ac1);
				session.update(ac1);
				session.beginTransaction().commit();
			
				}
			break;
			}
		else
		{
			System.out.println("Wrong Account No");
		}
		}
		catch (Exception e) 
			{
				System.out.println("Please,Enter Your Correct Account No");
			}
		}
	}
	@SuppressWarnings("resource")
	@Override
	public void accountBalance() 
	{
		Session session =HibernateUtil.getSessionFactory().openSession();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter your Account No");
		while(true)
		{
		String d1=sc2.next();
		Account ac1=session.get(Account.class,d1);
		try 
		{
		if(d1.equals(ac1.getAccNo()))
			{
			System.out.println("Enter the Password");
			int pass=sc2.nextInt();
			if(pass==ac1.getPassword())
				{
				System.out.println("===============================================");
				System.out.println("              Your Balance Details             ");
				System.out.println("===============================================");
				System.out.println();
				int rem_amt =ac1.getMinBal();	
				System.out.println("Available balance in your Account is  :"+rem_amt);
				System.out.println();
				System.out.println("===============================================");
				System.out.println("         Thank You,Have a Good Day !!          ");
				System.out.println("                Visit Again !!                 ");
				System.out.println("===============================================");
				}
			break;
			}
		else
		{
			System.out.println("please");
		}
		}
		catch (Exception e)
			{
				System.out.println("Please,Enter Your Correct Account No");
			}
		}
	}
}
