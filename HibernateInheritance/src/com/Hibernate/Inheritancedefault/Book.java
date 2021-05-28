package com.Hibernate.Inheritancedefault;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book extends MyProduct
{
	@Id
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
