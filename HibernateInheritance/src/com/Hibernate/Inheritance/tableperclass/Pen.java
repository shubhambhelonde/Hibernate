package com.Hibernate.Inheritance.tableperclass;

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
