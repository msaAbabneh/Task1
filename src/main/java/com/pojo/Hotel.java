package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "offerDateRange", "destination", "hotelInfo", "hotelUrgencyInfo", "hotelPricingInfo",
		"hotelUrls" })
public class Hotel {

	@JsonProperty("offerDateRange")
	private OfferDateRange offerDateRange;
	@JsonProperty("destination")
	private Destination destination;
	@JsonProperty("hotelInfo")
	private HotelInfo hotelInfo;
	@JsonProperty("hotelUrgencyInfo")
	private HotelUrgencyInfo hotelUrgencyInfo;
	@JsonProperty("hotelPricingInfo")
	private HotelPricingInfo hotelPricingInfo;
	@JsonProperty("hotelUrls")
	private HotelUrls hotelUrls;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Hotel() {
	}

	/**
	 * 
	 * @param offerDateRange
	 * @param hotelUrls
	 * @param hotelInfo
	 * @param hotelPricingInfo
	 * @param hotelUrgencyInfo
	 * @param destination
	 */
	public Hotel(OfferDateRange offerDateRange, Destination destination, HotelInfo hotelInfo,
			HotelUrgencyInfo hotelUrgencyInfo, HotelPricingInfo hotelPricingInfo, HotelUrls hotelUrls) {
		super();
		this.offerDateRange = offerDateRange;
		this.destination = destination;
		this.hotelInfo = hotelInfo;
		this.hotelUrgencyInfo = hotelUrgencyInfo;
		this.hotelPricingInfo = hotelPricingInfo;
		this.hotelUrls = hotelUrls;
	}

	@JsonProperty("offerDateRange")
	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	@JsonProperty("offerDateRange")
	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	@JsonProperty("destination")
	public Destination getDestination() {
		return destination;
	}

	@JsonProperty("destination")
	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	@JsonProperty("hotelInfo")
	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	@JsonProperty("hotelInfo")
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	@JsonProperty("hotelUrgencyInfo")
	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}

	@JsonProperty("hotelUrgencyInfo")
	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}

	@JsonProperty("hotelPricingInfo")
	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	@JsonProperty("hotelPricingInfo")
	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	@JsonProperty("hotelUrls")
	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}

	@JsonProperty("hotelUrls")
	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

}