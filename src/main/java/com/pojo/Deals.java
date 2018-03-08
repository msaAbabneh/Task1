
package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "offerInfo", "userInfo", "offers" })
public class Deals {

	@JsonProperty("offerInfo")
	private OfferInfo offerInfo;
	@JsonProperty("userInfo")
	private UserInfo userInfo;
	@JsonProperty("offers")
	private Offers offers;
	
	

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Deals() {
	}

	/**
	 * 
	 * @param offers
	 * @param offerInfo
	 * @param userInfo
	 */
	public Deals(OfferInfo offerInfo, UserInfo userInfo, Offers offers) {
		super();
		this.offerInfo = offerInfo;
		this.userInfo = userInfo;
		this.offers = offers;
	}

	@JsonProperty("offerInfo")
	public OfferInfo getOfferInfo() {
		return offerInfo;
	}

	@JsonProperty("offerInfo")
	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	@JsonProperty("userInfo")
	public UserInfo getUserInfo() {
		return userInfo;
	}

	@JsonProperty("userInfo")
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@JsonProperty("offers")
	public Offers getOffers() {
		return offers;
	}

	@JsonProperty("offers")
	public void setOffers(Offers offers) {
		this.offers = offers;
	}

}
