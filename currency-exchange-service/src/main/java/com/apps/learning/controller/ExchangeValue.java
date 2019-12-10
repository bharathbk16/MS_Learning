package com.apps.learning.controller;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exchange_value")
public class ExchangeValue {

	@Id
	private int id;

	private String fromCurrency;

	private String toCurrency;

	private BigDecimal exchangeMultiple;

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

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
