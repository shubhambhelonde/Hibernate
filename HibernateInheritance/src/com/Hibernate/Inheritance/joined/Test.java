package com.Hibernate.Inheritance.joined;

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

mysql> select * from karvenagar;
+--------------+----+
| regularbatch | id |
+--------------+----+
| B132         | 11 |
+--------------+----+
1 row in set (0.12 sec)

mysql> select * from cjc;
+----+--------+---------+
| id | cname  | sname   |
+----+--------+---------+
| 11 | Java   | Shubham |
| 22 | Python | Swapnil |
+----+--------+---------+
2 rows in set (0.02 sec)

mysql> select * from akurdi;
+--------------+----+
| weekendbatch | id |
+--------------+----+
| B125         | 22 |
+--------------+----+
*/