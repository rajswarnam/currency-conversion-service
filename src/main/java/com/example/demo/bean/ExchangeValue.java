package com.example.demo.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	@Id
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "from_currency")
	private String from;
	@Column(name = "to_currency")
	private String to;
	private BigDecimal conversionMultiple;
	@Column(name="port")
	private int serverPort;

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal exchangeValue) {
		this.conversionMultiple = exchangeValue;
	}

	public ExchangeValue() {
	}

	public ExchangeValue(String from, String to, BigDecimal conversionMultiple) {
		// super();
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

}
