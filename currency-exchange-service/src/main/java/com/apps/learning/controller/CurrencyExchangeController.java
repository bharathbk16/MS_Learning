package com.apps.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	CurrencyExchangeRepo cer;
	
	@Autowired
	Environment env;
	
	@GetMapping(value = "/getExchangeValue/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue ev = cer.findByFromCurrencyAndToCurrency(from, to);
		ev.setPort(env.getProperty("local.server.port"));
		return ev;
	}

}
