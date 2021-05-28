package com.Hibernate.Inheritancedefault;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MyProduct
{
	@Id
	private int productId;
	private String name;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
