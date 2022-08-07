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

import com.example.demo.model.Room;
import com.example.demo.service.RoomService;

@RestController
public class RoomController {
	@Autowired
	private RoomService service;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/showroom")
	public List<Room> list() {
		return service.showEmploy();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/room/{id}")
	public ResponseEntity<Room> get(@PathVariable int id) {
		try {
			Room employ = service.search(id);
			return new ResponseEntity<Room>(employ, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Room>(HttpStatus.NOT_FOUND);
		}
	}
}
