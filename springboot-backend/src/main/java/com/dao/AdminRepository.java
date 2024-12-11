package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

}
