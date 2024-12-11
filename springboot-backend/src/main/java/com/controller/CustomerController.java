package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Customer;
import com.service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	private CustomerService userServ;
	
	@PostMapping("/add-user")
	public int addUser(@RequestBody Customer customer) {
    	return userServ.addUser(customer);
    }

	@GetMapping("/login/{emailId}/{password}")
	public Customer showLogin(@PathVariable String emailId, @PathVariable String password){
		
		return userServ.showLogin(emailId, password);
	}
	
	@PutMapping("/update-profile")
	public int updateUser(@RequestBody Customer customer) {
		
		return userServ.updateUser(customer);
	}
	
	@PutMapping("/update-profile-photo/{emailId}/{profilePhoto}")
	public int updateProfilePhoto(@PathVariable String emailId, @PathVariable String profilePhoto){
		
		return userServ.updateProfilePhoto(emailId, profilePhoto);
		
	}
	
	@DeleteMapping("/delete-user/{emailid}")
	public String deleteUser(@PathVariable String emailId) {
		
		return userServ.deleteUser(emailId);
	}
	
	@GetMapping("/search-by-id/{emailId}")
	public Optional<Customer> searchById(@PathVariable String emailId) {
		
		return userServ.searchById(emailId);
	}
	
	@GetMapping("/search-by-gender/{gender}")
	public List<Customer> searchByGender(@PathVariable String gender){
		
		return userServ.searchByGender(gender);
	}
	
	@GetMapping("/search-by-religion/{religion}")
	public List<Customer> searchByReligion(@PathVariable String religion){
		
		return userServ.searchByReligion(religion);
	}
	
	@GetMapping("/search-by-name/{fullName}")
	public List<Customer> searchByName(@PathVariable String fullName){
		
		return userServ.searchByName(fullName);
	}
	
	@GetMapping("/search-by-city/{city}")
	public List<Customer> searchByCity(@PathVariable String city){
		
		return userServ.searchByCity(city);
	}
	
	@GetMapping("/show-all")
	public List<Customer> showAll(){
		
		return userServ.showAll();
	}
}



