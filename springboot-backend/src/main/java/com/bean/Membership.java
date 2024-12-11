package com.bean;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MembershipMatrimony")
public class Membership {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int memId;
	private Date fromDate;
	private Date toDate;
	private String memType;
	
	private String emailId;

	public Membership(int memId, Date fromDate, Date toDate, String memType, String emailId) {
		this.memId = memId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.memType = memType;
		this.emailId = emailId;
	}

	public Membership() {
	}

	public int getMemId() {
		return memId;
	}

	public void setMemId(int memId) {
		this.memId = memId;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getMemType() {
		return memType;
	}

	public void setMemType(String memType) {
		this.memType = memType;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Membership [memId=" + memId + ", fromDate=" + fromDate + ", toDate=" + toDate + ", memType=" + memType
				+ ", emailId=" + emailId + "]";
	}
	
}
