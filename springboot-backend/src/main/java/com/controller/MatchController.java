package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Match;
import com.service.MatchService;

@RestController
@CrossOrigin
@RequestMapping("/Match")
public class MatchController {
	
	@Autowired
	private MatchService matServ;
	
	@GetMapping("/get-by-id/{matchId}")
	public Match getMatchById(@PathVariable int matchId) {
		return matServ.getMatchById(matchId);
	}
	
	@PostMapping("/add-match/{byEmailId}/{forEmailId}")
	public Match addMatch(@PathVariable String byEmailId, @PathVariable String forEmailId) {
		return matServ.addMatch(byEmailId, forEmailId);
	}
	
	@DeleteMapping("/delete/{matchId}")
	public void deleteMatchById(int matchId) {
		matServ.deleteMatchById(matchId);
	}
	
	@PutMapping("/confirmed/{matchId}")
	public void confirmMatchById(int matchId) {
		matServ.confirmMatchById(matchId);
	}
	
	@PutMapping("/blocked/{matchId}")
	public void blockMatchById(int matchId) {
		matServ.blockMatchById(matchId);
	}

}
