package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Admin;
import com.service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	private AdminService adServ;
	
	@DeleteMapping("/delete-user/{emailid}")
	public String deleteUser(@PathVariable String emailId) {
		
		return adServ.deleteUser(emailId);
	}
	
	@GetMapping("/show-all")
	public List<Admin> showAll(){
		
		return adServ.showAll();
	}

}
