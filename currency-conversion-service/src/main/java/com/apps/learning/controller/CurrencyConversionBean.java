package com.apps.learning.controller;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private int id;

	private String fromCurrency;

	private String toCurrency;

	private BigDecimal exchangeMultiple;

	private BigDecimal quantity;

	private BigDecimal totalCalculatedAmount;

	private String port;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public BigDecimal getExchangeMultiple() {
		return exchangeMultiple;
	}

	public void setExchangeMultiple(BigDecimal exchangeMultiple) {
		this.exchangeMultiple = exchangeMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
