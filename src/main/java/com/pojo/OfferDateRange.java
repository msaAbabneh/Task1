package com.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "travelStartDate", "travelEndDate", "lengthOfStay" })
public class OfferDateRange {

	@JsonProperty("travelStartDate")
	private List<Long> travelStartDate = new ArrayList<Long>();
	@JsonProperty("travelEndDate")
	private List<Long> travelEndDate = new ArrayList<Long>();
	@JsonProperty("lengthOfStay")
	private long lengthOfStay;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public OfferDateRange() {
	}

	/**
	 * 
	 * @param travelEndDate
	 * @param lengthOfStay
	 * @param travelStartDate
	 */
	public OfferDateRange(List<Long> travelStartDate, List<Long> travelEndDate, long lengthOfStay) {
		super();
		this.travelStartDate = travelStartDate;
		this.travelEndDate = travelEndDate;
		this.lengthOfStay = lengthOfStay;
	}

	@JsonProperty("travelStartDate")
	public List<Long> getTravelStartDate() {
		return travelStartDate;
	}

	@JsonProperty("travelStartDate")
	public void setTravelStartDate(List<Long> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	@JsonProperty("travelEndDate")
	public List<Long> getTravelEndDate() {
		return travelEndDate;
	}

	@JsonProperty("travelEndDate")
	public void setTravelEndDate(List<Long> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	@JsonProperty("lengthOfStay")
	public long getLengthOfStay() {
		return lengthOfStay;
	}

	@JsonProperty("lengthOfStay")
	public void setLengthOfStay(long lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}