package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Customer;



public interface CustomerService {

	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	//public Optional<Customer> getById(Integer id);

//	public String deleteById(Integer id);
//	public Customer updateCustomer(Integer id, Customer customer);
}
