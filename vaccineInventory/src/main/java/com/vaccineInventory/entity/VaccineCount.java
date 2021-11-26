package com.vaccineInventory.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VaccineCount {
	
	@Id
	private int quantity;
	private double price;
	
	
	
	public VaccineCount(int quantity, double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}
	public VaccineCount() {
		super();
		
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
