package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
    private CustomerRepository repo;
	
	@Autowired
	private CustomerDAO dao;
	
	public String authenticate(String user,String pwd) {
		return dao.authenticate(user, pwd);
	}
	
	public Customer search(int menuId) {
		return repo.findById(menuId).get();
	}
	public List<Customer> showEmploy() {
		return repo.findAll();
	}
}
