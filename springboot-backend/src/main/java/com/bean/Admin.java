package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AdminMatrimony")
public class Admin {
	
	@Id
	private String emailId;
	private String password;
	
	public Admin(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}

	public Admin() {
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [emailId=" + emailId + ", password=" + password + "]";
	}

}
