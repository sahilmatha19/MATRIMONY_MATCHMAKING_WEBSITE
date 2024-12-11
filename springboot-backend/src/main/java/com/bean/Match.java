package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MatchMatrimony")
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int matchId;
	private String byEmailId;
	private String forEmailId;
	public String matchStatus;
	
	public Match(int matchId, String byEmailId, String forEmailId, String matchStatus) {
		super();
		this.matchId = matchId;
		this.byEmailId = byEmailId;
		this.forEmailId = forEmailId;
		this.matchStatus = matchStatus;
	}

	public Match() {
		super();
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getByEmailId() {
		return byEmailId;
	}

	public void setByEmailId(String byEmailId) {
		this.byEmailId = byEmailId;
	}

	public String getForEmailId() {
		return forEmailId;
	}

	public void setForEmailId(String forEmailId) {
		this.forEmailId = forEmailId;
	}

	public String getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", byEmailId=" + byEmailId + ", forEmailId=" + forEmailId
				+ ", matchStatus=" + matchStatus + "]";
	}

}
