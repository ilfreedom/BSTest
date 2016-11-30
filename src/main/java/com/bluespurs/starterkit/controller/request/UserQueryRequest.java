package com.bluespurs.starterkit.controller.request;

import org.hibernate.validator.constraints.NotBlank;

public class UserQueryRequest {

	@NotBlank
    private String productName;

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
