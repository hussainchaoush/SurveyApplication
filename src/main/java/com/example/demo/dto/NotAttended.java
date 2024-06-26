package com.example.demo.dto;

public class NotAttended {

	private String reason;
	
	public NotAttended() {
		// TODO Auto-generated constructor stub
	}

	public NotAttended(String reason) {
		super();
		this.reason = reason;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "NotAttended [reason=" + reason + "]";
	}

	
}
