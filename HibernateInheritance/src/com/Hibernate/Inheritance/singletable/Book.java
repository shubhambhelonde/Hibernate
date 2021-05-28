package com.Hibernate.Inheritance.singletable;

import javax.persistence.Entity;

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
