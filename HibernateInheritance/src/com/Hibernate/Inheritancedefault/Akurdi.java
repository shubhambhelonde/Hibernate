package com.Hibernate.Inheritancedefault;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Akurdi  extends CJC
{
	@Id
	private String weekendbatch;

	public String getWeekendbatch() {
		return weekendbatch;
	}

	public void setWeekendbatch(String weekendbatch) {
		this.weekendbatch = weekendbatch;
	}
}
