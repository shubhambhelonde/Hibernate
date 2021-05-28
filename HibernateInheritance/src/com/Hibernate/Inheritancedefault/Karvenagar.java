package com.Hibernate.Inheritancedefault;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Karvenagar extends CJC 
{
	@Id
	private String regularbatch;

	public String getRegularbatch() {
		return regularbatch;
	}

	public void setRegularbatch(String regularbatch) {
		this.regularbatch = regularbatch;
	}
}
