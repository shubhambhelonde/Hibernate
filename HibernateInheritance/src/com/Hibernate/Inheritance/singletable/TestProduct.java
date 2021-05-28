package com.Hibernate.Inheritance.singletable;

import org.hibernate.Session;

public class TestProduct
{
	public static void main(String[] args)
	{
		Book b = new Book();
		b.setProductId(123);
		b.setName("ALCHEMIST");
		b.setAuthor("Pauol colho");
		
		
		Pen p = new Pen();
		p.setProductId(144);
		p.setName("Musafir");
		p.setPen("Red");
		
		Session session = HibernateUtil1.getSessionFactory().openSession();
		session.save(b);
		session.save(p);
		session.beginTransaction().commit();
		}
}
