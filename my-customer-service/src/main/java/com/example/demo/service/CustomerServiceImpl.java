package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.model.Customer;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
	@Autowired
	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		log.info("within create customer service");
		return customerDao.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		log.info("within display customer service");
		List<Customer> c = customerDao.findAll();
		return c;
	}
/*
	@Override
	public Optional<Customer> getById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Customer> customer = customerDao.findById(id);
		log.info("within get by id in customer service");
		if(customer.isEmpty())
		{
			throw new CustomerNotFoundException("Not found");
		}
		return customer;
	}
	


	@Override
	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Customer> customer1 = customerDao.findById(id);
		log.info("within get by id in customer service");
		if(customer1.isEmpty())
		{
			throw new CustomerNotFoundException("Not found");
		}
		Customer tempCustomer = customer1.get();
		customerDao.delete(tempCustomer);
		log.info("deleted");
		return "Deleted";
		
	}

	@Override
	public Customer updateCustomer(Integer id, Customer customer) {
		Optional<Customer> customer1 = customerDao.findById(id);
		log.info("within get by id in customer service");
		if(customer1.isEmpty())
		{
			throw new CustomerNotFoundException("Not found");
		}
		Customer tempCust = customer1.get();
		tempCust.setCustomerName(customer.getCustomerName());
		tempCust.setCustomerAddress(customer.getCustomerAddress());
		customerDao.save(tempCust);
		log.info("updated");
		return tempCust;
	}
*/
}
