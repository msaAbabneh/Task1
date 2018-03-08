
package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "personaType" })
public class Persona {

	@JsonProperty("personaType")
	private String personaType;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Persona() {
	}

	/**
	 * 
	 * @param personaType
	 */
	public Persona(String personaType) {
		super();
		this.personaType = personaType;
	}

	@JsonProperty("personaType")
	public String getPersonaType() {
		return personaType;
	}

	@JsonProperty("personaType")
	public void setPersonaType(String personaType) {
		this.personaType = personaType;
	}

}