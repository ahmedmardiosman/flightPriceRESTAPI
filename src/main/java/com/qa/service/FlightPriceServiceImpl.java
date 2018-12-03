package com.qa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.util.PriceGenerator;

@Service
public class FlightPriceServiceImpl implements FlightPriceService {

	@Autowired
	PriceGenerator priceGenerator;

	public String generateFlightPrice() {

		return priceGenerator.randomFlightPrice();
	}

}
