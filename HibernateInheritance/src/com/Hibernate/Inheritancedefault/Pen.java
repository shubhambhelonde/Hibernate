package com.Hibernate.Inheritancedefault;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pen extends MyProduct 
{
	@Id
	private String pen;

	public String getPen() {
		return pen;
	}

	public void setPen(String pen) {
		this.pen = pen;
	}
}
