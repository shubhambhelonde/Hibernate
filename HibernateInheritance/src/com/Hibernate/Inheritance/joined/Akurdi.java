package com.Hibernate.Inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Akurdi  extends CJC
{
	
	private String weekendbatch;

	public String getWeekendbatch() {
		return weekendbatch;
	}

	public void setWeekendbatch(String weekendbatch) {
		this.weekendbatch = weekendbatch;
	}
}
