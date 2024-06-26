package com.example.demo.dto;


public class Attended {
	private String participated;
    private String engaging;
    private String continueParticipate;
    private String rating;
	public Attended() {
		// TODO Auto-generated constructor stub
	}
	public Attended(String participated, String engaging, String continueParticipate, String rating) {
		super();
		this.participated = participated;
		this.engaging = engaging;
		this.continueParticipate = continueParticipate;
		this.rating = rating;
	}
	public String getParticipated() {
		return participated;
	}
	public void setParticipated(String participated) {
		this.participated = participated;
	}
	public String getEngaging() {
		return engaging;
	}
	public void setEngaging(String engaging) {
		this.engaging = engaging;
	}
	public String getContinueParticipate() {
		return continueParticipate;
	}
	public void setContinueParticipate(String continueParticipate) {
		this.continueParticipate = continueParticipate;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Attended [participated=" + participated + ", engaging=" + engaging + ", continueParticipate="
				+ continueParticipate + ", rating=" + rating + "]";
	}
	
}
