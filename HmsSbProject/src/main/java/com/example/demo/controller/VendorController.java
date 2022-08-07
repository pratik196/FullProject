package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.VendorDAO;
import com.example.demo.model.Vendor;
import com.example.demo.service.VendorService;

@RestController
public class VendorController {

	@Autowired
	private VendorService service;
	
	@Autowired
	private VendorDAO dao;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/showVendor")
	public List<Vendor> list() {
		return service.showVendor();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/vendorAuthenticate/{user}/{pwd}")
	public String autneticateion(@PathVariable String user, @PathVariable String pwd) {
		return service.authenticate(user, pwd);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/vendor/{id}")
	public ResponseEntity<Vendor> get(@PathVariable int id) {
		try {
		Vendor vendor = service.search(id);
		return new ResponseEntity<Vendor>(vendor,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Vendor>(HttpStatus.NOT_FOUND);
		}
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/searchByVendor/{user}")
	public ResponseEntity<Vendor> searchByUserName(@PathVariable String user) {
		try {
		Vendor vendor = dao.searchByVendorName(user);
		return new ResponseEntity<Vendor>(vendor,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Vendor>(HttpStatus.NOT_FOUND);
		}
	} 
}
