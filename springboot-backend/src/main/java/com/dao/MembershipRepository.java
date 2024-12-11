package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Membership;

public interface MembershipRepository extends JpaRepository<Membership, Integer> {

}
