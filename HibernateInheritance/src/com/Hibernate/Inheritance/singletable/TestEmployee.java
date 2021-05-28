package com.Hibernate.Inheritance.singletable;

import org.hibernate.Session;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		
	Contract_Employee cemp= new Contract_Employee();
	cemp.setEid(111);
	cemp.setEname("Shubham");
	cemp.setPay_per_hour(12000.0f);
	cemp.setContract_duration("2 Years");
	
	Regular_Employee remp = new Regular_Employee();
	remp.setEid(22);
	remp.setEname("Swapnil");
	remp.setSalary(145200.0f);
	remp.setBonus(50000);
	
	Session session = HibernateUtil2.getSessionFactory().openSession();
	session.save(cemp);
	session.save(remp);
	session.beginTransaction().commit();
	}
}
/*
 
 mysql> show tables;
+------------------------+
| Tables_in_inheritance1 |
+------------------------+
| employee               |
+------------------------+
1 row in set (0.32 sec)

mysql> select * from employee;
+-------------------+-----+---------+-------+--------+-------------------+--------------+
| DTYPE             | eid | ename   | bonus | salary | contract_duration | pay_per_hour |
+-------------------+-----+---------+-------+--------+-------------------+--------------+
| Regular_Employee  |  22 | Swapnil | 50000 | 145200 | NULL              |         NULL |
| Contract_Employee | 111 | Shubham |  NULL |   NULL | 2 Years           |        12000 |
+-------------------+-----+---------+-------+--------+-------------------+--------------+
 */

















