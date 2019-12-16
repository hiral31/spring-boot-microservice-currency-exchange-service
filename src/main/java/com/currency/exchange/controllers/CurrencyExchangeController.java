package com.currency.exchange.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.exchange.bean.ExchangeValue;
import com.currency.exchange.service.ExchangeValueService;




@RestController
public class CurrencyExchangeController {
	
	@Autowired
	ExchangeValueService exchangeValueService;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from,@PathVariable String to) {
		return exchangeValueService.findByFromAndTo(from, to);
	}

}
