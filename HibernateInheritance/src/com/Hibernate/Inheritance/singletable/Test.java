package com.Hibernate.Inheritance.singletable;

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
mysql> select * from cjc;
+------------+----+--------+---------+--------------+--------------+
| DTYPE      | id | cname  | sname   | regularbatch | weekendbatch |
+------------+----+--------+---------+--------------+--------------+
| Karvenagar | 11 | Java   | Shubham | B132         | NULL         |
| Akurdi     | 22 | Python | Swapnil | NULL         | B125         |
+------------+----+--------+---------+--------------+--------------+
*/