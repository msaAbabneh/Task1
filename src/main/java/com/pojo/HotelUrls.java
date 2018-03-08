
package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "hotelInfositeUrl", "hotelSearchResultUrl" })
public class HotelUrls {

	@JsonProperty("hotelInfositeUrl")
	private String hotelInfositeUrl;
	@JsonProperty("hotelSearchResultUrl")
	private String hotelSearchResultUrl;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public HotelUrls() {
	}

	/**
	 * 
	 * @param hotelSearchResultUrl
	 * @param hotelInfositeUrl
	 */
	public HotelUrls(String hotelInfositeUrl, String hotelSearchResultUrl) {
		super();
		this.hotelInfositeUrl = hotelInfositeUrl;
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}

	@JsonProperty("hotelInfositeUrl")
	public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}

	@JsonProperty("hotelInfositeUrl")
	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}

	@JsonProperty("hotelSearchResultUrl")
	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}

	@JsonProperty("hotelSearchResultUrl")
	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}

}