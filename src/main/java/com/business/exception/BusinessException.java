package com.business.exception;

/**
 *
 * Business Exception which warps all Exceptions
 *
 */
public class BusinessException extends Exception {

	public static final String GENERAL_ERROR = "Pleas try later";

	public BusinessException(String messege) {
		super(messege);
	}

}
