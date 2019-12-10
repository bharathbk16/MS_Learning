package com.apps.learning.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepo extends JpaRepository<ExchangeValue, Integer> {
	ExchangeValue findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);
	
}
