package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

	Customer findByEmailIdAndPassword(String emailId, String password);

	List<Customer> findByGender(String gender);

	List<Customer> findByReligion(String religion);

	List<Customer> findByCity(String city);

	List<Customer> findByFullName(String fullName);

	Optional<Customer> findByMobileNo(String mobileNo);

}

