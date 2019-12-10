package com.apps.learning.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	Environment env;
	
	@Autowired
	CurrencyExchangeProxy cep;

	@GetMapping(value = "/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getConvertedBean(@PathVariable String from, @PathVariable String to,
			@PathVariable String quantity) {

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
				env.getProperty("currency.exchange.service.uri"), CurrencyConversionBean.class, uriVariables);
		CurrencyConversionBean response = responseEntity.getBody();
		BigDecimal qnt = new BigDecimal(quantity);
		response.setQuantity(qnt);
		response.setTotalCalculatedAmount(qnt.multiply(response.getExchangeMultiple()));
		return response;
	}
	
	@GetMapping(value = "/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getConvertedBeanFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable String quantity) {
		CurrencyConversionBean response = cep.getExchangeValue(from, to);
		BigDecimal qnt = new BigDecimal(quantity);
		response.setQuantity(qnt);
		response.setTotalCalculatedAmount(qnt.multiply(response.getExchangeMultiple()));
		return response;
	}
}
