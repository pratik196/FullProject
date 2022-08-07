package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.VendorDAO;
import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;

@Service
@Transactional
public class VendorService {

	@Autowired
    private VendorRepository repo;
	
	@Autowired
	private VendorDAO dao;
	
	public String authenticate(String user,String pwd) {
		return dao.authenticate(user, pwd);
	}
	
	public Vendor search(int venId) {
		return repo.findById(venId).get();
	}
	public List<Vendor> showVendor() {
		return repo.findAll();
	}
}
