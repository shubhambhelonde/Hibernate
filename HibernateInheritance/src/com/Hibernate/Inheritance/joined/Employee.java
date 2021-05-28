package com.Hibernate.Inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee
{
	@Id
	private int eId;
	private String eName;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
}
