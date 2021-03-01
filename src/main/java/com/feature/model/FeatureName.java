package com.feature.model;

public enum FeatureName {
	PersonalLoan(1),
	creditCard(2),
	Insurance(3);
	
	
	private Integer id;

	private FeatureName(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
