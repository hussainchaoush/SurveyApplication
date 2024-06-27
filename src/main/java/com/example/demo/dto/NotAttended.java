package com.example.demo.dto;

public class NotAttended {

	private String reason;
	private String otherReason;
	public NotAttended() {
		// TODO Auto-generated constructor stub
	}
	public NotAttended(String reason, String otherReason) {
		super();
		this.reason = reason;
		this.otherReason = otherReason;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getOtherReason() {
		return otherReason;
	}
	public void setOtherReason(String otherReason) {
		this.otherReason = otherReason;
	}
	@Override
	public String toString() {
		return "NotAttended [reason=" + reason + ", otherReason=" + otherReason + "]";
	}

	
	
}
