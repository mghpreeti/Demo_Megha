package com.feature.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Feature {
	@Id
	@GeneratedValue
	 private FeatureName  id;
	

	@NotNull
	private String emailId;
	
	@NotNull
	private boolean enable;
	
	@NotNull
	private boolean access;


	public FeatureName getId() {
		return id;
	}
	public void setId(FeatureName id) {
		this.id = id;
	}
	
	 public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public boolean isAccess() {
		return access;
	}
	public void setAccess(boolean access) {
		this.access = access;
	}

}
