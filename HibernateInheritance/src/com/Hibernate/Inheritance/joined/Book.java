package com.Hibernate.Inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book extends MyProduct
{
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
