package com.bluespurs.starterkit.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bluespurs.ProductEntity;


public class ProductQueryController {
	public static final String BestBuysKey = "pfe9fpy68yg28hvvma49sc89";
	public static final String WalmartKey = "rm25tyum3p9jm9x9x7zxshfa";
	
	@RequestMapping(value="/product/search",method = RequestMethod.GET)
    public @ResponseBody ProductEntity queryProduct(@RequestParam("name") String name) {
		
		
		System.out.print("product:"+name);
		
		//To get the product's price both in BestBuy and Walmart
		ProductEntity entity = new ProductEntity();
		entity.setProductName(name);
		entity.setCurrency("CAD");
		/*entity.setLocation(RandomUtil.getRandomString(10, 10));
		entity.setBestPrice(RandomUtil.getRandomInt());*/
		
		return entity;
    }
}
