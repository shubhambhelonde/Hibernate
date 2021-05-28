package com.Hibernate.Inheritance.singletable;

import javax.persistence.Entity;

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
