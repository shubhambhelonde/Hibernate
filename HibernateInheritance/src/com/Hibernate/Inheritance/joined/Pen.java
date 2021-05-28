package com.Hibernate.Inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.Id;

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
