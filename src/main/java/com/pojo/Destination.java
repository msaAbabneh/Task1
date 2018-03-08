package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "regionID", "associatedMultiCityRegionId", "longName", "shortName", "country", "province", "city",
		"tla", "nonLocalizedCity" })
public class Destination {

	@JsonProperty("regionID")
	private String regionID;
	@JsonProperty("associatedMultiCityRegionId")
	private String associatedMultiCityRegionId;
	@JsonProperty("longName")
	private String longName;
	@JsonProperty("shortName")
	private String shortName;
	@JsonProperty("country")
	private String country;
	@JsonProperty("province")
	private String province;
	@JsonProperty("city")
	private String city;
	@JsonProperty("tla")
	private String tla;
	@JsonProperty("nonLocalizedCity")
	private String nonLocalizedCity;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Destination() {
	}

	/**
	 * 
	 * @param province
	 * @param longName
	 * @param nonLocalizedCity
	 * @param tla
	 * @param shortName
	 * @param associatedMultiCityRegionId
	 * @param regionID
	 * @param city
	 * @param country
	 */
	public Destination(String regionID, String associatedMultiCityRegionId, String longName, String shortName,
			String country, String province, String city, String tla, String nonLocalizedCity) {
		super();
		this.regionID = regionID;
		this.associatedMultiCityRegionId = associatedMultiCityRegionId;
		this.longName = longName;
		this.shortName = shortName;
		this.country = country;
		this.province = province;
		this.city = city;
		this.tla = tla;
		this.nonLocalizedCity = nonLocalizedCity;
	}

	@JsonProperty("regionID")
	public String getRegionID() {
		return regionID;
	}

	@JsonProperty("regionID")
	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	@JsonProperty("associatedMultiCityRegionId")
	public String getAssociatedMultiCityRegionId() {
		return associatedMultiCityRegionId;
	}

	@JsonProperty("associatedMultiCityRegionId")
	public void setAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
		this.associatedMultiCityRegionId = associatedMultiCityRegionId;
	}

	@JsonProperty("longName")
	public String getLongName() {
		return longName;
	}

	@JsonProperty("longName")
	public void setLongName(String longName) {
		this.longName = longName;
	}

	@JsonProperty("shortName")
	public String getShortName() {
		return shortName;
	}

	@JsonProperty("shortName")
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("province")
	public String getProvince() {
		return province;
	}

	@JsonProperty("province")
	public void setProvince(String province) {
		this.province = province;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("tla")
	public String getTla() {
		return tla;
	}

	@JsonProperty("tla")
	public void setTla(String tla) {
		this.tla = tla;
	}

	@JsonProperty("nonLocalizedCity")
	public String getNonLocalizedCity() {
		return nonLocalizedCity;
	}

	@JsonProperty("nonLocalizedCity")
	public void setNonLocalizedCity(String nonLocalizedCity) {
		this.nonLocalizedCity = nonLocalizedCity;
	}

}
