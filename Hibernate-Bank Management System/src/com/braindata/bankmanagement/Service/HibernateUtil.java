package com.braindata.bankmanagement.Service;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.braindata.bankmanagement.model.Account;


public class HibernateUtil 
{
	private static StandardServiceRegistry registry;
	private static SessionFactory sf;
	public static SessionFactory getSessionFactory()
	{
		if(sf==null)
		{
	
	Map<String, Object> m = new HashMap<>();
	m.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	m.put(Environment.URL,"jdbc:mysql://localhost:3306/BankManagementSystem");
	m.put(Environment.USER,"root");
	m.put(Environment.PASS,"root");
	m.put(Environment.DIALECT,"org.hibernate.dialect.MySQL55Dialect");
	m.put(Environment.HBM2DDL_AUTO,"update");
	m.put(Environment.SHOW_SQL,"true");
	
	registry = new StandardServiceRegistryBuilder().applySettings(m).build();
	
	MetadataSources mds= new MetadataSources(registry);
	
	mds.addAnnotatedClass(Account.class);
	
	Metadata md=mds.getMetadataBuilder().build();
	
	sf=md.getSessionFactoryBuilder().build();
		}
		return sf;
		
	}
}
