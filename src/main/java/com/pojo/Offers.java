
package com.pojo;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Hotel" })
public class Offers {

	@JsonProperty("Hotel")
	private List<Hotel> hotel = new ArrayList<Hotel>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Offers() {
	}

	/**
	 * 
	 * @param hotel
	 */
	public Offers(List<Hotel> hotel) {
		super();
		this.hotel = hotel;
	}

	@JsonProperty("Hotel")
	public List<Hotel> getHotel() {
		return hotel;
	}

	@JsonProperty("Hotel")
	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}

}