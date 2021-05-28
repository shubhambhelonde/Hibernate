package com.Hibernate.Inheritancedefault;

import org.hibernate.Session;

public class Test
{
	public static void main(String[] args)
	{
		Karvenagar krg = new Karvenagar();
		krg.setId(11);
		krg.setSname("Shubham");
		krg.setCname("Java");
		krg.setRegularbatch("B132");
		
		Akurdi akd = new Akurdi();
		akd.setId(22);
		akd.setSname("Swapnil");
		akd.setCname("Python");
		akd.setWeekendbatch("B125");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.save(krg);
		session.save(akd);
		session.beginTransaction().commit();
	}
}
/*
mysql> use inheritance;
Database changed
mysql> show tables;
+-----------------------+
| Tables_in_inheritance |
+-----------------------+
| akurdi                |
| karvenagar            |
+-----------------------+
2 rows in set (0.04 sec)

mysql> select * from karvenagar;
+--------------+-------+----+---------+
| regularbatch | cname | id | sname   |
+--------------+-------+----+---------+
| B132         | Java  | 11 | Shubham |
+--------------+-------+----+---------+
1 row in set (0.12 sec)

mysql> select * from akurdi;
+--------------+--------+----+---------+
| weekendbatch | cname  | id | sname   |
+--------------+--------+----+---------+
| B125         | Python | 22 | Swapnil |
+--------------+--------+----+---------+

*/