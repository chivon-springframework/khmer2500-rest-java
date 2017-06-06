package com.khmer2500.enums;

public enum Status {
	INACTIVE,
	ACTIVE,
	DELETED,
	LOCKED;
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(final String state) {
		this.state = state;
	}
}
