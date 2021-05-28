package com.Hibernate.Inheritance.singletable;

import javax.persistence.Entity;

@Entity
public class Pen extends MyProduct 
{
	private String pen;

	public String getPen() {
		return pen;
	}

	public void setPen(String pen) {
		this.pen = pen;
	}
}
