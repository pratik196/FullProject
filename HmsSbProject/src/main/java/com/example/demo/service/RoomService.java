package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Room;
import com.example.demo.repository.RoomRepository;

@Service
@Transactional
public class RoomService {
	@Autowired
    private RoomRepository repo;
	
	public Room search(int roomId) {
		return repo.findById(roomId).get();
	}
	public List<Room> showEmploy() {
		return repo.findAll();
	}

}
