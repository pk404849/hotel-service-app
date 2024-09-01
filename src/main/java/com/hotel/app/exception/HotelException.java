package com.hotel.app.exception;

public class HotelException extends Exception {

	private static final long serialVersionUID = 5604628980114276520L;

	private String message;

	public HotelException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
