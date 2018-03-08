package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "averagePriceValue", "totalPriceValue", "crossOutPriceValue", "originalPricePerNight",
		"percentSavings", "drr" })
public class HotelPricingInfo {

	@JsonProperty("averagePriceValue")
	private double averagePriceValue;
	@JsonProperty("totalPriceValue")
	private double totalPriceValue;
	@JsonProperty("crossOutPriceValue")
	private double crossOutPriceValue;
	@JsonProperty("originalPricePerNight")
	private double originalPricePerNight;
	@JsonProperty("percentSavings")
	private double percentSavings;
	@JsonProperty("drr")
	private boolean drr;
	
	@JsonProperty("currency")
	private String currency;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public HotelPricingInfo() {
	}

	/**
	 * 
	 * @param totalPriceValue
	 * @param averagePriceValue
	 * @param originalPricePerNight
	 * @param drr
	 * @param percentSavings
	 * @param crossOutPriceValue
	 */
	public HotelPricingInfo(double averagePriceValue, double totalPriceValue, double crossOutPriceValue,
			double originalPricePerNight, double percentSavings, boolean drr,String currency) {
		super();
		this.averagePriceValue = averagePriceValue;
		this.totalPriceValue = totalPriceValue;
		this.crossOutPriceValue = crossOutPriceValue;
		this.originalPricePerNight = originalPricePerNight;
		this.percentSavings = percentSavings;
		this.drr = drr;
		this.currency=currency;
	}

	@JsonProperty("averagePriceValue")
	public double getAveragePriceValue() {
		return averagePriceValue;
	}

	@JsonProperty("averagePriceValue")
	public void setAveragePriceValue(double averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	@JsonProperty("totalPriceValue")
	public double getTotalPriceValue() {
		return totalPriceValue;
	}

	@JsonProperty("totalPriceValue")
	public void setTotalPriceValue(double totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	@JsonProperty("crossOutPriceValue")
	public double getCrossOutPriceValue() {
		return crossOutPriceValue;
	}

	@JsonProperty("crossOutPriceValue")
	public void setCrossOutPriceValue(double crossOutPriceValue) {
		this.crossOutPriceValue = crossOutPriceValue;
	}

	@JsonProperty("originalPricePerNight")
	public double getOriginalPricePerNight() {
		return originalPricePerNight;
	}

	@JsonProperty("originalPricePerNight")
	public void setOriginalPricePerNight(double originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	@JsonProperty("percentSavings")
	public double getPercentSavings() {
		return percentSavings;
	}

	@JsonProperty("percentSavings")
	public void setPercentSavings(double percentSavings) {
		this.percentSavings = percentSavings;
	}

	@JsonProperty("drr")
	public boolean isDrr() {
		return drr;
	}

	@JsonProperty("drr")
	public void setDrr(boolean drr) {
		this.drr = drr;
	}
	
	
	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("drr")
	public void setCurrency(String currency) {
		this.currency  = currency;
		}
	


}