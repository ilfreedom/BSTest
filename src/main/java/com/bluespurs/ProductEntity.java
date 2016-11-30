package com.bluespurs;

import java.io.Serializable;

public class ProductEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6972287561156683841L;
	
	private String productName;
	private double bestPrice;
	private String currency;
	private String location;
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getBestPrice() {
		return bestPrice;
	}
	public void setBestPrice(double bestPrice) {
		this.bestPrice = bestPrice;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
