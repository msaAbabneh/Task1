package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "hotelId", "hotelName", "localizedHotelName", "hotelDestination", "hotelDestinationRegionID",
		"hotelLongDestination", "hotelStreetAddress", "hotelCity", "hotelProvince", "hotelCountryCode", "hotelLatitude",
		"hotelLongitude", "hotelStarRating", "hotelGuestReviewRating", "hotelReviewTotal", "hotelImageUrl",
		"isOfficialRating" })

public class HotelInfo {

	@JsonProperty("hotelId")
	private String hotelId;
	@JsonProperty("hotelName")
	private String hotelName;
	@JsonProperty("localizedHotelName")
	private String localizedHotelName;
	@JsonProperty("hotelDestination")
	private String hotelDestination;
	@JsonProperty("hotelDestinationRegionID")
	private String hotelDestinationRegionID;
	@JsonProperty("hotelLongDestination")
	private String hotelLongDestination;
	@JsonProperty("hotelStreetAddress")
	private String hotelStreetAddress;
	@JsonProperty("hotelCity")
	private String hotelCity;
	@JsonProperty("hotelProvince")
	private String hotelProvince;
	@JsonProperty("hotelCountryCode")
	private String hotelCountryCode;
	@JsonProperty("hotelLatitude")
	private double hotelLatitude;
	@JsonProperty("hotelLongitude")
	private double hotelLongitude;
	@JsonProperty("hotelStarRating")
	private String hotelStarRating;
	@JsonProperty("vipAccess")
	private String vipAccess;
	
	@JsonProperty("hotelGuestReviewRating")
	private double hotelGuestReviewRating;
	@JsonProperty("hotelReviewTotal")
	private long hotelReviewTotal;
	@JsonProperty("hotelImageUrl")
	private String hotelImageUrl;
	@JsonProperty("isOfficialRating")
	private boolean isOfficialRating;
	
	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public HotelInfo() {
	}

	/**
	 * 
	 * @param hotelStreetAddress
	 * @param hotelImageUrl
	 * @param localizedHotelName
	 * @param hotelStarRating
	 * @param hotelDestination
	 * @param hotelLatitude
	 * @param isOfficialRating
	 * @param hotelProvince
	 * @param hotelDestinationRegionID
	 * @param hotelId
	 * @param hotelCity
	 * @param hotelLongitude
	 * @param hotelReviewTotal
	 * @param hotelName
	 * @param hotelGuestReviewRating
	 * @param hotelCountryCode
	 * @param hotelLongDestination
	 */
	public HotelInfo(String hotelId, String hotelName, String localizedHotelName, String hotelDestination,
			String hotelDestinationRegionID, String hotelLongDestination, String hotelStreetAddress, String hotelCity,
			String hotelProvince, String hotelCountryCode, double hotelLatitude, double hotelLongitude,
			String hotelStarRating,String vipAccess, double hotelGuestReviewRating, long hotelReviewTotal, String hotelImageUrl,
			boolean isOfficialRating) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.localizedHotelName = localizedHotelName;
		this.hotelDestination = hotelDestination;
		this.hotelDestinationRegionID = hotelDestinationRegionID;
		this.hotelLongDestination = hotelLongDestination;
		this.hotelStreetAddress = hotelStreetAddress;
		this.hotelCity = hotelCity;
		this.hotelProvince = hotelProvince;
		this.hotelCountryCode = hotelCountryCode;
		this.hotelLatitude = hotelLatitude;
		this.hotelLongitude = hotelLongitude;
		this.hotelStarRating = hotelStarRating;
		this.vipAccess=vipAccess;
		this.hotelGuestReviewRating = hotelGuestReviewRating;
		this.hotelReviewTotal = hotelReviewTotal;
		this.hotelImageUrl = hotelImageUrl;
		this.isOfficialRating = isOfficialRating;
	}

	@JsonProperty("hotelId")
	public String getHotelId() {
		return hotelId;
	}

	@JsonProperty("hotelId")
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	@JsonProperty("hotelName")
	public String getHotelName() {
		return hotelName;
	}

	@JsonProperty("hotelName")
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	@JsonProperty("localizedHotelName")
	public String getLocalizedHotelName() {
		return localizedHotelName;
	}

	@JsonProperty("localizedHotelName")
	public void setLocalizedHotelName(String localizedHotelName) {
		this.localizedHotelName = localizedHotelName;
	}

	@JsonProperty("hotelDestination")
	public String getHotelDestination() {
		return hotelDestination;
	}

	@JsonProperty("hotelDestination")
	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	@JsonProperty("hotelDestinationRegionID")
	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	@JsonProperty("hotelDestinationRegionID")
	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	@JsonProperty("hotelLongDestination")
	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	@JsonProperty("hotelLongDestination")
	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	@JsonProperty("hotelStreetAddress")
	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	@JsonProperty("hotelStreetAddress")
	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	@JsonProperty("hotelCity")
	public String getHotelCity() {
		return hotelCity;
	}

	@JsonProperty("hotelCity")
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	@JsonProperty("hotelProvince")
	public String getHotelProvince() {
		return hotelProvince;
	}

	@JsonProperty("hotelProvince")
	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	@JsonProperty("hotelCountryCode")
	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	@JsonProperty("hotelCountryCode")
	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	@JsonProperty("hotelLatitude")
	public double getHotelLatitude() {
		return hotelLatitude;
	}

	@JsonProperty("hotelLatitude")
	public void setHotelLatitude(double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	@JsonProperty("hotelLongitude")
	public double getHotelLongitude() {
		return hotelLongitude;
	}

	@JsonProperty("hotelLongitude")
	public void setHotelLongitude(double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	@JsonProperty("hotelStarRating")
	public String getHotelStarRating() {
		return hotelStarRating;
	}

	@JsonProperty("hotelStarRating")
	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}
	
	
	@JsonProperty("vipAccess")
	public String getVipAccess() {
		return vipAccess;
	}

	@JsonProperty("vipAccess")
	public void setVipAccess(String vipAccess) {
		this.vipAccess = vipAccess;
	}
	
	

	@JsonProperty("hotelGuestReviewRating")
	public double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	@JsonProperty("hotelGuestReviewRating")
	public void setHotelGuestReviewRating(double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	@JsonProperty("hotelReviewTotal")
	public long getHotelReviewTotal() {
		return hotelReviewTotal;
	}

	@JsonProperty("hotelReviewTotal")
	public void setHotelReviewTotal(long hotelReviewTotal) {
		this.hotelReviewTotal = hotelReviewTotal;
	}

	@JsonProperty("hotelImageUrl")
	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	@JsonProperty("hotelImageUrl")
	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	@JsonProperty("isOfficialRating")
	public boolean isIsOfficialRating() {
		return isOfficialRating;
	}

	@JsonProperty("isOfficialRating")
	public void setIsOfficialRating(boolean isOfficialRating) {
		this.isOfficialRating = isOfficialRating;
	}

}