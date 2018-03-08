package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "airAttachRemainingTime", "numberOfPeopleViewing", "numberOfPeopleBooked", "numberOfRoomsLeft",
		"lastBookedTime", "almostSoldStatus", "link", "airAttachEnabled" })
public class HotelUrgencyInfo {

	@JsonProperty("airAttachRemainingTime")
	private long airAttachRemainingTime;
	@JsonProperty("numberOfPeopleViewing")
	private long numberOfPeopleViewing;
	@JsonProperty("numberOfPeopleBooked")
	private long numberOfPeopleBooked;
	@JsonProperty("numberOfRoomsLeft")
	private long numberOfRoomsLeft;
	@JsonProperty("lastBookedTime")
	private long lastBookedTime;
	@JsonProperty("almostSoldStatus")
	private String almostSoldStatus;
	@JsonProperty("link")
	private String link;
	@JsonProperty("airAttachEnabled")
	private boolean airAttachEnabled;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public HotelUrgencyInfo() {
	}

	/**
	 * 
	 * @param lastBookedTime
	 * @param airAttachEnabled
	 * @param numberOfPeopleBooked
	 * @param almostSoldStatus
	 * @param numberOfRoomsLeft
	 * @param link
	 * @param numberOfPeopleViewing
	 * @param airAttachRemainingTime
	 */
	public HotelUrgencyInfo(long airAttachRemainingTime, long numberOfPeopleViewing, long numberOfPeopleBooked,
			long numberOfRoomsLeft, long lastBookedTime, String almostSoldStatus, String link,
			boolean airAttachEnabled) {
		super();
		this.airAttachRemainingTime = airAttachRemainingTime;
		this.numberOfPeopleViewing = numberOfPeopleViewing;
		this.numberOfPeopleBooked = numberOfPeopleBooked;
		this.numberOfRoomsLeft = numberOfRoomsLeft;
		this.lastBookedTime = lastBookedTime;
		this.almostSoldStatus = almostSoldStatus;
		this.link = link;
		this.airAttachEnabled = airAttachEnabled;
	}

	@JsonProperty("airAttachRemainingTime")
	public long getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}

	@JsonProperty("airAttachRemainingTime")
	public void setAirAttachRemainingTime(long airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	@JsonProperty("numberOfPeopleViewing")
	public long getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}

	@JsonProperty("numberOfPeopleViewing")
	public void setNumberOfPeopleViewing(long numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	@JsonProperty("numberOfPeopleBooked")
	public long getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}

	@JsonProperty("numberOfPeopleBooked")
	public void setNumberOfPeopleBooked(long numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	@JsonProperty("numberOfRoomsLeft")
	public long getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}

	@JsonProperty("numberOfRoomsLeft")
	public void setNumberOfRoomsLeft(long numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	@JsonProperty("lastBookedTime")
	public long getLastBookedTime() {
		return lastBookedTime;
	}

	@JsonProperty("lastBookedTime")
	public void setLastBookedTime(long lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	@JsonProperty("almostSoldStatus")
	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}

	@JsonProperty("almostSoldStatus")
	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	@JsonProperty("link")
	public String getLink() {
		return link;
	}

	@JsonProperty("link")
	public void setLink(String link) {
		this.link = link;
	}

	@JsonProperty("airAttachEnabled")
	public boolean isAirAttachEnabled() {
		return airAttachEnabled;
	}

	@JsonProperty("airAttachEnabled")
	public void setAirAttachEnabled(boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

}
