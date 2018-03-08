package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "siteID", "language", "currency" })
public class OfferInfo {

	@JsonProperty("siteID")
	private String siteID;
	@JsonProperty("language")
	private String language;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("userSelectedCurrency")
	private String userSelectedCurrency;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public OfferInfo() {
	}

	/**
	 * 
	 * @param siteID
	 * @param language
	 * @param currency
	 */
	public OfferInfo(String siteID, String language, String currency) {
		super();
		this.siteID = siteID;
		this.language = language;
		this.currency = currency;
	}

	@JsonProperty("siteID")
	public String getSiteID() {
		return siteID;
	}

	@JsonProperty("siteID")
	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}

	@JsonProperty("language")
	public void setLanguage(String language) {
		this.language = language;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	@JsonProperty("userSelectedCurrency")
	public String getUserSelectedCurrency() {
		return userSelectedCurrency;
	}

	@JsonProperty("userSelectedCurrency")
	public void setUserSelectedCurrency(String userSelectedCurrency) {
		this.userSelectedCurrency = userSelectedCurrency;
	}
	
	

}
