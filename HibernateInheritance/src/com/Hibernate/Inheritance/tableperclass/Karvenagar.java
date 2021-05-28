package com.Hibernate.Inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Karvenagar extends CJC 
{
	private String regularbatch;

	public String getRegularbatch() {
		return regularbatch;
	}

	public void setRegularbatch(String regularbatch) {
		this.regularbatch = regularbatch;
	}
}
