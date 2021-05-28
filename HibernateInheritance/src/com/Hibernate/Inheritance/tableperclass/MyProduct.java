package com.Hibernate.Inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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
/*
1.Employee
a. private int eId;
b. private String eName;

2. Contract_Employee
a. private float pay_per_hour;
b. private String contract_duration;

3.Regular_Employee
a. private float salary;
b. private int bonus;
*/
