package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Match;
import com.dao.MatchRepository;

@Service
public class MatchService {
	
	@Autowired
	private MatchRepository matRepo;
	
	public Match getMatchById(int matchId) {
		return matRepo.findById(matchId).orElseThrow();		
	}
	
	public Match addMatch(String byEmailId, String forEmailId) {
        Match match = new Match();
        match.setByEmailId(byEmailId);
        match.setForEmailId(forEmailId);
        match.setMatchStatus("PENDING");
        return matRepo.save(match);
    }
	
	public void deleteMatchById(int matchId) {
		matRepo.deleteById(matchId);
	}
	
	public void confirmMatchById(int matchId) {
		Match match = getMatchById(matchId);
		match.matchStatus = "Confirmed";
		Match mNew = matRepo.save(match);
	}
	
	public void blockMatchById(int matchId) {
		Match match = getMatchById(matchId);
		match.matchStatus = "Blocked";
		Match mNew = matRepo.save(match);
	}

}
