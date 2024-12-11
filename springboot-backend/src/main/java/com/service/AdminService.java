package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Admin;
import com.dao.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adRepo;
	
	public String deleteUser(String emailId) {
		
		System.out.println("Delete User Method!!");
		System.out.println(emailId);
		adRepo.deleteById(emailId);
		return "User deleted Successfully";
	}
	
	public List<Admin> showAll(){
		
		System.out.println("Show All Method!!");
		return adRepo.findAll();
	}

}
