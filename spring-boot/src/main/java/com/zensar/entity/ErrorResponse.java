package com.zensar.entity;

import java.util.Date;

public class ErrorResponse {
	
	private Date timestamp;
	
	private String description;
	
	

	public ErrorResponse() {
		super();
	}

	public ErrorResponse(Date timestamp, String description) {
		super();
		this.timestamp = timestamp;
		this.description = description;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ErrorResponse [timestamp=" + timestamp + ", description=" + description + "]";
	}
	
	
	

}
