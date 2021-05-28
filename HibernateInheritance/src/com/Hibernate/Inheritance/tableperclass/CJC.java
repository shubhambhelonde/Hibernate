package com.Hibernate.Inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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
