package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Match;

public interface MatchRepository extends JpaRepository<Match, Integer>{

}
