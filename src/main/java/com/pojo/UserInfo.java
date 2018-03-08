package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "persona", "userId" })
public class UserInfo {

	@JsonProperty("persona")
	private Persona persona;
	@JsonProperty("userId")
	private String userId;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public UserInfo() {
	}

	/**
	 * 
	 * @param userId
	 * @param persona
	 */
	public UserInfo(Persona persona, String userId) {
		super();
		this.persona = persona;
		this.userId = userId;
	}

	@JsonProperty("persona")
	public Persona getPersona() {
		return persona;
	}

	@JsonProperty("persona")
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@JsonProperty("userId")
	public String getUserId() {
		return userId;
	}

	@JsonProperty("userId")
	public void setUserId(String userId) {
		this.userId = userId;
	}

}