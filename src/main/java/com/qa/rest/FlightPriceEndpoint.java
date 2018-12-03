package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.FlightPriceService;

@RestController
public class FlightPriceEndpoint {

	@Autowired
	FlightPriceService service;

	@RequestMapping("${URL.method}")
	public String flightPrice() {
		return service.generateFlightPrice();
	}
}
