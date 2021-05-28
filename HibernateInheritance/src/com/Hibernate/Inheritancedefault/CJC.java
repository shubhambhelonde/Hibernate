package com.Hibernate.Inheritancedefault;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CJC 
{
	@Id
	private int id;
	private String sname;
	private String cname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
/*
1. public class MyProduct {

private long productId;
private String name;

}


2. public class Book extends MyProduct {
private String author;
}

3. public class Pen extends MyProduct {
private String color;
}
*/