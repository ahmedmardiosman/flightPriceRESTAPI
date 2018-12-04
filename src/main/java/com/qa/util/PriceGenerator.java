package com.qa.util;

import org.springframework.stereotype.Component;

@Component
public class PriceGenerator {
	
	private Double priceDouble;
	private Double priceRounded;
	private String price;
	
	public String randomFlightPrice() {
		
		priceDouble =  Math.random() * 500 + 1;
		
		priceRounded = Math.round(priceDouble * 100.0) / 100.0;
		
		price = Double.toString(priceRounded);
		
		return price;
	}
	
	
	

}
