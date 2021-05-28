package com.Hibernate.Inheritance.tableperclass;

import org.hibernate.Session;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		
	
	Contract_Employee cemp= new Contract_Employee();
	cemp.seteId(1111);
	cemp.seteName("Shubham");
	cemp.setContract_duration("2 Years");
	cemp.setPay_per_hour(120000.0f);
	
	Regular_Employee remp = new Regular_Employee();
	remp.seteId(2222);
	remp.seteName("Swapnil");
	remp.setSalary(145200.0f);
	remp.setBonus(50000);
	
	Session session = HibernateUtil2.getSessionFactory().openSession();
	session.save(cemp);
	session.save(remp);
	session.beginTransaction().commit();
	}
}
