package com.Hibernate.Inheritance.tableperclass;

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
+----+-------+---------+--------------+
| id | cname | sname   | regularbatch |
+----+-------+---------+--------------+
| 11 | Java  | Shubham | B132         |
+----+-------+---------+--------------+
1 row in set (0.00 sec)

mysql> select * from akurdi;
+----+--------+---------+--------------+
| id | cname  | sname   | weekendbatch |
+----+--------+---------+--------------+
| 22 | Python | Swapnil | B125         |
+----+--------+---------+--------------+
1 row in set (0.00 sec)

mysql> select * from cjc;
Empty set (0.00 sec)
*/