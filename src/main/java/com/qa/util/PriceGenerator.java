package com.qa.util;

import org.springframework.stereotype.Component;

@Component
public class PriceGenerator {
//	
//	private Double priceDouble;
//	private String price;
	
	public String randomFlightPrice() {
		
//		priceDouble =  Math.random() * 500 + 1;
//		
//		price = Double.toString(priceDouble);
		
		return Double.toString(Math.random() * 500 + 1);
	}
	
	
	

}
