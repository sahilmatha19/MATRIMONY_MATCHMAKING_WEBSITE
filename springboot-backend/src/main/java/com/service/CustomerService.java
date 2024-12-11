package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.dao.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository userRepo;
	
	public int addUser(Customer customer) {

    	System.out.println("\nAdd User Method!!");
    	
    	Optional<Customer> customer1 = userRepo.findById(customer.getEmailId());
    	System.out.println(customer1);
    	
    	Optional<Customer> customer2 = userRepo.findByMobileNo(customer.getMobileNo());
    	System.out.println(customer2);
    	
    	if(customer1.isEmpty() && customer2.isEmpty()) {
    		userRepo.save(customer);
    		return 1;
    	}
    	else {
    		return 0;
    	}
	}
	
	public Customer showLogin(String emailId, String password){
		
		System.out.println("\nShowLogin Method!!");
		Customer customer = userRepo.findByEmailIdAndPassword(emailId, password);
		
		System.out.println("Email Id: " +emailId);
		System.out.println("Password: " +password);
		
		return customer;
	}
	
	public int updateUser(Customer customer) {
		
		System.out.println("\nUpdate User Method!!");
		System.out.println(customer);
		
		Optional<Customer> c = userRepo.findById(customer.getEmailId());
		
		String password = c.map(Customer::getPassword).orElse("DefaultPassword");
		customer.setPassword(password);
		
		String gender = c.map(Customer::getGender).orElse("DefaultGender");
		customer.setGender(gender);
		
		String profilePhoto = c.map(Customer::getProfilePhoto).orElse("https://static.vecteezy.com/system/resources/previews/002/318/271/non_2x/user-profile-icon-free-vector.jpg");
		customer.setProfilePhoto(profilePhoto);
		
//		c.ifPresent(cust -> cust.setPassword(customer.getPassword()));
		
		userRepo.save(customer);
		return 1;
	}
	
	public int updateProfilePhoto(String emailId, String profilePhoto) {
		
		System.out.println("\nUpdate Profile Photo Method!!");
		System.out.println(emailId);
		System.out.println(profilePhoto);
		
		Optional<Customer> c = userRepo.findById(emailId);
		
		c.ifPresent(cust -> cust.setProfilePhoto(profilePhoto));	
		
		c.ifPresent(cust -> userRepo.save(cust));		
		
		return 1;		
	}
	
	public String deleteUser(String emailId) {
		
		System.out.println("\nDelete User Method!!");
		System.out.println(emailId);
		userRepo.deleteById(emailId);
		return "User deleted Successfully";
	}
	
	public Optional<Customer> searchById(String emailId) {
		
		System.out.println("\nSearchById Method!!");
		System.out.println(emailId);
		return userRepo.findById(emailId);
	}
	
	public List<Customer> searchByGender(String gender){
		
		System.out.println("\nSearchByGender Method!!");
		System.out.println(gender);
		
		if(gender.equals("male")) {
			return userRepo.findByGender("female");
		}
		else if(gender.equals("female")){
			return userRepo.findByGender("male");
		}
		else
			return null;
	}
	
	public List<Customer> searchByReligion(String religion){
		
		System.out.println("\nSearchByReligion Method!!");
		System.out.println(religion);
		return userRepo.findByReligion(religion);
	}
	
	public List<Customer> searchByName(String fullName){
		
		System.out.println("\nSearchByName Method!!");
		System.out.println(fullName);
		return userRepo.findByFullName(fullName);
	}
	
	public List<Customer> searchByCity(String city){
		
		System.out.println("\nSearchByCity Method!!");
		System.out.println(city);
		return userRepo.findByCity(city);
	}
	
	
	public List<Customer> showAll(){
		
		System.out.println("\nShow All Method!!");
		return userRepo.findAll();
	}

}
